package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;

public class Company {

    @JsonProperty("cn")
    private String cn;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("closed_on")
    private String closedOn;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getClosedOn() {
        return closedOn;
    }

    public void setClosedOn(String closedOn) {
        this.closedOn = closedOn;
    }



    public Company(String cn, String createdOn, String closedOn) {
        this.cn = cn;
        this.createdOn = createdOn;
        this.closedOn = closedOn;
    }




}
