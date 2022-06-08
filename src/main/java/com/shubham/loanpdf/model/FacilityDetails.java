package com.shubham.loanpdf.model;

public class FacilityDetails
{
    String tenureOfFacility ;
    String FacilityAmount ;
    String FacilityDate ,
    TypeOfFacility ,
    NumberOfTranches;

    public String getTenureOfFacility() {
        return tenureOfFacility;
    }

    public void setTenureOfFacility(String tenureOfFacility) {
        this.tenureOfFacility = tenureOfFacility;
    }

    public String getFacilityAmount() {
        return FacilityAmount;
    }

    public void setFacilityAmount(String facilityAmount) {
        FacilityAmount = facilityAmount;
    }

    public String getFacilityDate() {
        return FacilityDate;
    }

    public void setFacilityDate(String facilityDate) {
        FacilityDate = facilityDate;
    }

    public String getTypeOfFacility() {
        return TypeOfFacility;
    }

    public void setTypeOfFacility(String typeOfFacility) {
        TypeOfFacility = typeOfFacility;
    }

    public String getNumberOfTranches() {
        return NumberOfTranches;
    }

    public void setNumberOfTranches(String numberOfTranches) {
        NumberOfTranches = numberOfTranches;
    }
}
