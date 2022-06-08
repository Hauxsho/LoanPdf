package com.shubham.loanpdf.model;

public class EMIdetails {
    String EMI_Amount ,
            EMI_DueDate ,
    NumberOfEMI;

    public String getEMI_Amount() {
        return EMI_Amount;
    }

    public void setEMI_Amount(String EMI_Amount) {
        this.EMI_Amount = EMI_Amount;
    }

    public String getEMI_DueDate() {
        return EMI_DueDate;
    }

    public void setEMI_DueDate(String EMI_DueDate) {
        this.EMI_DueDate = EMI_DueDate;
    }

    public String getNumberOfEMI() {
        return NumberOfEMI;
    }

    public void setNumberOfEMI(String numberOfEMI) {
        NumberOfEMI = numberOfEMI;
    }
}
