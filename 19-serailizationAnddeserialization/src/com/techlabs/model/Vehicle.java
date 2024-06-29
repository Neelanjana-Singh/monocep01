package com.techlabs.model;

import java.io.Serializable;

class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L; // Add serialVersionUID
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
