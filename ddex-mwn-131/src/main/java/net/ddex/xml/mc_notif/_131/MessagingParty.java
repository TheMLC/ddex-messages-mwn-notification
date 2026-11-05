package net.ddex.xml.mc_notif._131;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Composite containing details of a MessagingParty.
 * <p>
 * Java class for MessagingParty complex type
 * </p>
 * .
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="MessagingParty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PartyId" type="{http://ddex.net/xml/mc-notif/131}PartyId" maxOccurs="unbounded"/>
 *         <element name="PartyName" type="{http://ddex.net/xml/mc-notif/131}PartyName" minOccurs="0"/>
 *         <element name="TradingName" type="{http://ddex.net/xml/mc-notif/131}Name" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="LanguageAndScriptCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingParty", propOrder = {
        "partyId",
        "partyName",
        "tradingName"
})
public class MessagingParty {

    @XmlElement(name = "PartyId", required = true)
    protected List<PartyId> partyId;

    @XmlElement(name = "PartyName")
    protected PartyName partyName;

    @XmlElement(name = "TradingName")
    protected Name tradingName;

    @XmlAttribute(name = "LanguageAndScriptCode")
    protected String languageAndScriptCode;

    public List<PartyId> getPartyId() {
        if (partyId == null) {
            partyId = new ArrayList<>();
        }
        return this.partyId;
    }

    public void addPartyId(PartyId p) {
        if (partyId == null) {
            partyId = new ArrayList<>();
        }
        partyId.add(p);
    }

    public PartyName getPartyName() {
        return partyName;
    }

    public void setPartyName(PartyName value) {
        this.partyName = value;
    }

    public Name getTradingName() {
        return tradingName;
    }

    public void setTradingName(Name value) {
        this.tradingName = value;
    }

    public String getLanguageAndScriptCode() {
        return languageAndScriptCode;
    }

    public void setLanguageAndScriptCode(String value) {
        this.languageAndScriptCode = value;
    }

}
