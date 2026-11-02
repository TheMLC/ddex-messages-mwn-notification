# Usage Examples

## FtpAcknowledgementMessage (MWN 1.3.1 Jakarta)

`FtpAcknowledgementMessage` is a response message sent to acknowledge receipt of a manifest file.
Required fields: `MessageHeader` (sender, recipient, timestamp), `AcknowledgedMessageId`, `FileStatus`, and the `AvsVersionId` XML attribute.

```java
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import net.ddex.xml.allowed_value_sets.MwnlFileStatus;
import net.ddex.xml.mc_notif._131.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.StringWriter;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class FtpAcknowledgementExample {

    public static void main(String[] args) throws JAXBException, DatatypeConfigurationException {
        FtpAcknowledgementMessage msg = buildAcknowledgement();

        // Both packages must be in the context so JAXB can resolve MwnlFileStatus
        JAXBContext ctx = JAXBContext.newInstance(
                "net.ddex.xml.mc_notif._131:net.ddex.xml.allowed_value_sets");
        Marshaller m = ctx.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        m.marshal(msg, sw);
        System.out.println(sw);
    }

    private static FtpAcknowledgementMessage buildAcknowledgement()
            throws DatatypeConfigurationException {

        // Sender
        PartyId senderDpid = new PartyId();
        senderDpid.setValue("PADPIDA2009010101O");
        senderDpid.setIsDPID(Boolean.TRUE);

        MessagingParty sender = new MessagingParty();
        sender.getPartyId().add(senderDpid);   // live list — no setter

        // Recipient
        PartyId recipientDpid = new PartyId();
        recipientDpid.setValue("PADPIDA2009020202O");
        recipientDpid.setIsDPID(Boolean.TRUE);

        MessagingParty recipient = new MessagingParty();
        recipient.getPartyId().add(recipientDpid);

        // Header
        BasicFtpMessageHeader header = new BasicFtpMessageHeader();
        header.setMessageSender(sender);
        header.setMessageRecipient(recipient);
        header.setMessageCreatedDateTime(
                DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(
                                OffsetDateTime.now()
                                        .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));

        // FileStatus: MwnlFileStatus.FILE_OK ("FileOK") or MwnlFileStatus.USER_DEFINED ("UserDefined")
        FileStatus fileStatus = new FileStatus();
        fileStatus.setValue(MwnlFileStatus.FILE_OK);

        // Assemble
        FtpAcknowledgementMessage msg = new FtpAcknowledgementMessage();
        msg.setMessageVersionId("1.3.1");
        msg.setAvsVersionId("1.3.1");           // required XML attribute
        msg.setMessageHeader(header);
        msg.setAcknowledgedMessageId("ORIG-MSG-ID-0001");
        msg.setFileStatus(fileStatus);
        // optional: msg.setErrorText("human-readable error description");
        // optional: msg.setProposedActionType(...);

        return msg;
    }
}
```

The above produces XML similar to:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<FtpAcknowledgementMessage xmlns="http://ddex.net/xml/mc-notif/131"
                           MessageVersionId="1.3.1"
                           AvsVersionId="1.3.1">
    <MessageHeader>
        <MessageSender>
            <PartyId IsDPID="true">PADPIDA2009010101O</PartyId>
        </MessageSender>
        <MessageRecipient>
            <PartyId IsDPID="true">PADPIDA2009020202O</PartyId>
        </MessageRecipient>
        <MessageCreatedDateTime>2026-10-30T10:00:00+01:00</MessageCreatedDateTime>
    </MessageHeader>
    <AcknowledgedMessageId>ORIG-MSG-ID-0001</AcknowledgedMessageId>
    <FileStatus>FileOK</FileStatus>
</FtpAcknowledgementMessage>
```
