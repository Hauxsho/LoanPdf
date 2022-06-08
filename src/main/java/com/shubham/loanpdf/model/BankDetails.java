package com.shubham.loanpdf.model;

public class BankDetails {
    String BankName ,
    AccountType ,
    IFSCCode,
            AccountNumber ;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getIFSCcode() {
        return IFSCCode;
    }

    public void setIFSCcode(String IFSCcode) {
        this.IFSCCode = IFSCcode;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }
}
