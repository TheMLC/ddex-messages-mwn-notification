package net.ddex.xml.mc_notif._131;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * A Composite containing details of a SocietyAffiliation.
 *
 * Hand-written for the same reason as RightShare: ExcludedTerritoryCode appears twice
 * in the same xs:choice, which Jakarta JAXB 4.0.8 rejects. Both occurrences map to the
 * single excludedTerritoryCode list.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocietyAffiliation", propOrder = {
    "territoryReference",
    "territoryCode",
    "excludedTerritoryCode",
    "rightsType",
    "validityPeriod",
    "percentage",
    "musicRightsSociety"
})
public class SocietyAffiliation {

    // Territory choice branch 1: IDREF references to Territory anchor (Y...)
    @XmlElement(name = "TerritoryReference")
    @XmlIDREF
    protected List<Object> territoryReference;

    // Territory choice branch 3 (first element): explicit territory codes
    @XmlElement(name = "TerritoryCode")
    protected List<CurrentTerritoryCode> territoryCode;

    // Territory choice branch 2 (standalone) and branch 3 (after TerritoryCode).
    // Both XSD branches map to this single field; only one branch is active at a time.
    @XmlElement(name = "ExcludedTerritoryCode")
    protected List<CurrentTerritoryCode> excludedTerritoryCode;

    @XmlElement(name = "RightsType", required = true)
    protected List<RightsType> rightsType;

    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodWithTerritoryReference validityPeriod;

    @XmlElement(name = "Percentage")
    @XmlSchemaType(name = "decimal")
    protected BigDecimal percentage;

    // xs:IDREF to a LocalPartyAnchorReference (P...)
    @XmlElement(name = "MusicRightsSociety", required = true)
    @XmlIDREF
    protected Object musicRightsSociety;

    public List<Object> getTerritoryReference() {
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

    public ValidityPeriodWithTerritoryReference getValidityPeriod() { return validityPeriod; }
    public void setValidityPeriod(ValidityPeriodWithTerritoryReference value) { this.validityPeriod = value; }

    public BigDecimal getPercentage() { return percentage; }
    public void setPercentage(BigDecimal value) { this.percentage = value; }

    public Object getMusicRightsSociety() { return musicRightsSociety; }
    public void setMusicRightsSociety(Object value) { this.musicRightsSociety = value; }
}
