package com.example.dataproviders.json.pojo.ex4;

import java.util.List;

public class Policies {
    private String policyNumber;
    private String policyHolder;
    private List<Claim> claims; // Array of nested objects represented as a List

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }
}


