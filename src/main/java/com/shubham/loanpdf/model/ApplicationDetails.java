package com.shubham.loanpdf.model;

public class ApplicationDetails {
    private String ApplicationNumber,
            Date ,
    FirmImage;

    public String getApplicationNumber() {
        return ApplicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        ApplicationNumber = applicationNumber;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFirmImage() {
        return FirmImage;
    }

    public void setFirmImage(String firmImage) {
        FirmImage = firmImage;
    }
}
