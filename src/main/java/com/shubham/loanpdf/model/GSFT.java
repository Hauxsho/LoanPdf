package com.shubham.loanpdf.model;

public class GSFT
{
    String Cheque ,
    Dated ,
    DrawnOn ,
    NameSourcingStaff ,
    ApplicationID;

    long Amount ;

    public String getCheque() {
        return Cheque;
    }

    public void setCheque(String cheque) {
        Cheque = cheque;
    }

    public String getDated() {
        return Dated;
    }

    public void setDated(String dated) {
        Dated = dated;
    }

    public String getDrawnOn() {
        return DrawnOn;
    }

    public void setDrawnOn(String drawnOn) {
        DrawnOn = drawnOn;
    }

    public String getNameSourcingStaff() {
        return NameSourcingStaff;
    }

    public void setNameSourcingStaff(String nameSourcingStaff) {
        NameSourcingStaff = nameSourcingStaff;
    }

    public String getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(String applicationID) {
        ApplicationID = applicationID;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }
}
