package net.ddex.xml.mc_notif._131;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.ddex.xml.allowed_value_sets.RightShareTypeMWDR;
import net.ddex.xml.allowed_value_sets.WorkPart;

/**
 * A Composite containing details of a RightShare.
 *
 * Hand-written because the ExcludedTerritoryCode element appears twice inside the same
 * xs:choice (once standalone, once in a nested xs:sequence), which causes XJC naming
 * conflicts. This class maps both occurrences to a single excludedTerritoryCode list,
 * which is correct for both unmarshalling branches.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightShare", propOrder = {
    "rightShareReference",
    "rightShareType",
    "workPart",
    "rightShareId",
    "agreementId",
    "rightShareWorkReference",
    "isWorkRelatedToSample",
    "territoryReference",
    "territoryCode",
    "excludedTerritoryCode",
    "rightsType",
    "useType",
    "excludedUseType",
    "dsp",
    "excludedDSP",
    "carrierType",
    "commercialModelType",
    "rightsController",
    "licensingAgent",
    "rightsControllerUnknown",
    "rightsControllerDisplayName",
    "publisherCredits",
    "validityPeriod",
    "rightShareUnknown",
    "rightShareNotClaimed",
    "rightSharePercentage",
    "hasRightsInDispute",
    "priorRoyalties",
    "isPayable",
    "rightsClaimPolicy",
    "hasOriginalPublisherShare",
    "isFollowerInTitleOf"
})
public class RightShare {

    @XmlElement(name = "RightShareReference", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String rightShareReference;

    @XmlElement(name = "RightShareType", required = true)
    @XmlSchemaType(name = "string")
    protected RightShareTypeMWDR rightShareType;

    @XmlElement(name = "WorkPart")
    @XmlSchemaType(name = "string")
    protected WorkPart workPart;

    @XmlElement(name = "RightShareId")
    protected ProprietaryId rightShareId;

    @XmlElement(name = "AgreementId")
    protected List<ProprietaryId> agreementId;

    // xs:IDREF list — each value is a LocalMusicalWorkAnchorReference starting with W
    @XmlElement(name = "RightShareWorkReference", required = true)
    @XmlIDREF
    protected List<MusicalWork> rightShareWorkReference;

    @XmlElement(name = "IsWorkRelatedToSample")
    protected Boolean isWorkRelatedToSample;

    // Territory choice branch 1: IDREF references to Territory anchor (Y...)
    @XmlElement(name = "TerritoryReference")
    @XmlIDREF
    protected List<Territory> territoryReference;

    // Territory choice branch 3 (first element): explicit territory codes
    @XmlElement(name = "TerritoryCode")
    protected List<CurrentTerritoryCode> territoryCode;

    // Territory choice branch 2 (standalone) and branch 3 (after TerritoryCode): excluded territories.
    // Both XSD branches map to this single field; only one branch is active at a time.
    @XmlElement(name = "ExcludedTerritoryCode")
    protected List<CurrentTerritoryCode> excludedTerritoryCode;

    @XmlElement(name = "RightsType", required = true)
    protected List<RightsType> rightsType;

    // UseType choice branch 1
    @XmlElement(name = "UseType")
    protected List<UseType> useType;

    // UseType choice branch 2
    @XmlElement(name = "ExcludedUseType")
    protected List<UseType> excludedUseType;

    // DSP choice branch 1
    @XmlElement(name = "DSP")
    protected List<DSP> dsp;

    // DSP choice branch 2
    @XmlElement(name = "ExcludedDSP")
    protected List<DSP> excludedDSP;

    @XmlElement(name = "CarrierType")
    protected List<CarrierType> carrierType;

    @XmlElement(name = "CommercialModelType")
    protected List<CommercialModelType> commercialModelType;

    // RightsController choice branch 1
    @XmlElement(name = "RightsController")
    protected RightsController rightsController;

    @XmlElement(name = "LicensingAgent")
    protected RightsController licensingAgent;

    // RightsController choice branch 2
    @XmlElement(name = "RightsControllerUnknown")
    protected Boolean rightsControllerUnknown;

    @XmlElement(name = "RightsControllerDisplayName")
    protected String rightsControllerDisplayName;

    @XmlElement(name = "PublisherCredits")
    protected String publisherCredits;

    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodWithTerritoryReference validityPeriod;

    // Share choice — exactly one of the three is set
    @XmlElement(name = "RightShareUnknown")
    protected Boolean rightShareUnknown;

    @XmlElement(name = "RightShareNotClaimed")
    protected Boolean rightShareNotClaimed;

    @XmlElement(name = "RightSharePercentage")
    protected Percentage rightSharePercentage;

    @XmlElement(name = "HasRightsInDispute")
    protected Boolean hasRightsInDispute;

    @XmlElement(name = "PriorRoyalties")
    protected Boolean priorRoyalties;

    @XmlElement(name = "IsPayable")
    protected Boolean isPayable;

    @XmlElement(name = "RightsClaimPolicy")
    protected List<RightsClaimPolicy> rightsClaimPolicy;

    @XmlElement(name = "HasOriginalPublisherShare")
    protected OriginalPublisherShare hasOriginalPublisherShare;

    @XmlElement(name = "IsFollowerInTitleOf")
    protected IsFollowerInTitleOf isFollowerInTitleOf;

    @XmlAttribute(name = "IsNetPublisherShare")
    protected Boolean isNetPublisherShare;

    public String getRightShareReference() { return rightShareReference; }
    public void setRightShareReference(String value) { this.rightShareReference = value; }

    public RightShareTypeMWDR getRightShareType() { return rightShareType; }
    public void setRightShareType(RightShareTypeMWDR value) { this.rightShareType = value; }

    public WorkPart getWorkPart() { return workPart; }
    public void setWorkPart(WorkPart value) { this.workPart = value; }

    public ProprietaryId getRightShareId() { return rightShareId; }
    public void setRightShareId(ProprietaryId value) { this.rightShareId = value; }

    public List<ProprietaryId> getAgreementId() {
        if (agreementId == null) agreementId = new ArrayList<>();
        return agreementId;
    }

    public List<MusicalWork> getRightShareWorkReference() {
        if (rightShareWorkReference == null) rightShareWorkReference = new ArrayList<>();
        return rightShareWorkReference;
    }

    public Boolean isIsWorkRelatedToSample() { return isWorkRelatedToSample; }
    public void setIsWorkRelatedToSample(Boolean value) { this.isWorkRelatedToSample = value; }

    public List<Territory> getTerritoryReference() {
        if (territoryReference == null) territoryReference = new ArrayList<>();
        return territoryReference;
    }

    public List<CurrentTerritoryCode> getTerritoryCode() {
        if (territoryCode == null) territoryCode = new ArrayList<>();
        return territoryCode;
    }

    public List<CurrentTerritoryCode> getExcludedTerritoryCode() {
        if (excludedTerritoryCode == null) excludedTerritoryCode = new ArrayList<>();
        return excludedTerritoryCode;
    }

    public List<RightsType> getRightsType() {
        if (rightsType == null) rightsType = new ArrayList<>();
        return rightsType;
    }

    public List<UseType> getUseType() {
        if (useType == null) useType = new ArrayList<>();
        return useType;
    }

    public List<UseType> getExcludedUseType() {
        if (excludedUseType == null) excludedUseType = new ArrayList<>();
        return excludedUseType;
    }

    public List<DSP> getDsp() {
        if (dsp == null) dsp = new ArrayList<>();
        return dsp;
    }

    public List<DSP> getExcludedDSP() {
        if (excludedDSP == null) excludedDSP = new ArrayList<>();
        return excludedDSP;
    }

    public List<CarrierType> getCarrierType() {
        if (carrierType == null) carrierType = new ArrayList<>();
        return carrierType;
    }

    public List<CommercialModelType> getCommercialModelType() {
        if (commercialModelType == null) commercialModelType = new ArrayList<>();
        return commercialModelType;
    }

    public RightsController getRightsController() { return rightsController; }
    public void setRightsController(RightsController value) { this.rightsController = value; }

    public RightsController getLicensingAgent() { return licensingAgent; }
    public void setLicensingAgent(RightsController value) { this.licensingAgent = value; }

    public Boolean isRightsControllerUnknown() { return rightsControllerUnknown; }
    public void setRightsControllerUnknown(Boolean value) { this.rightsControllerUnknown = value; }

    public String getRightsControllerDisplayName() { return rightsControllerDisplayName; }
    public void setRightsControllerDisplayName(String value) { this.rightsControllerDisplayName = value; }

    public String getPublisherCredits() { return publisherCredits; }
    public void setPublisherCredits(String value) { this.publisherCredits = value; }

    public ValidityPeriodWithTerritoryReference getValidityPeriod() { return validityPeriod; }
    public void setValidityPeriod(ValidityPeriodWithTerritoryReference value) { this.validityPeriod = value; }

    public Boolean isRightShareUnknown() { return rightShareUnknown; }
    public void setRightShareUnknown(Boolean value) { this.rightShareUnknown = value; }

    public Boolean isRightShareNotClaimed() { return rightShareNotClaimed; }
    public void setRightShareNotClaimed(Boolean value) { this.rightShareNotClaimed = value; }

    public Percentage getRightSharePercentage() { return rightSharePercentage; }
    public void setRightSharePercentage(Percentage value) { this.rightSharePercentage = value; }

    public Boolean isHasRightsInDispute() { return hasRightsInDispute; }
    public void setHasRightsInDispute(Boolean value) { this.hasRightsInDispute = value; }

    public Boolean isPriorRoyalties() { return priorRoyalties; }
    public void setPriorRoyalties(Boolean value) { this.priorRoyalties = value; }

    public Boolean isIsPayable() { return isPayable; }
    public void setIsPayable(Boolean value) { this.isPayable = value; }

    public List<RightsClaimPolicy> getRightsClaimPolicy() {
        if (rightsClaimPolicy == null) rightsClaimPolicy = new ArrayList<>();
        return rightsClaimPolicy;
    }

    public OriginalPublisherShare getHasOriginalPublisherShare() { return hasOriginalPublisherShare; }
    public void setHasOriginalPublisherShare(OriginalPublisherShare value) { this.hasOriginalPublisherShare = value; }

    public IsFollowerInTitleOf getIsFollowerInTitleOf() { return isFollowerInTitleOf; }
    public void setIsFollowerInTitleOf(IsFollowerInTitleOf value) { this.isFollowerInTitleOf = value; }

    public Boolean isIsNetPublisherShare() { return isNetPublisherShare; }
    public void setIsNetPublisherShare(Boolean value) { this.isNetPublisherShare = value; }
}
