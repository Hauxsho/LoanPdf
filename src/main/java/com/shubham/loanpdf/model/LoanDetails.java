package com.shubham.loanpdf.model;

public class LoanDetails {
    private String LoanAmount ;
    private String LoanPurpose ;
    private String LoanTenor ;

    public String getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        LoanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return LoanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        LoanPurpose = loanPurpose;
    }

    public String getLoanTenor() {
        return LoanTenor;
    }

    public void setLoanTenor(String loanTenor) {
        LoanTenor = loanTenor;
    }
}
