package org.example.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyVersionTwo {

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("tin")
    private String taxIdentificationNumber;

    @JsonProperty("dissolved_on")
    private String dissolvedOn;
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getDissolvedOn() {
        return dissolvedOn;
    }

    public void setDissolvedOn(String dissolvedOn) {
        this.dissolvedOn = dissolvedOn;
}

}
