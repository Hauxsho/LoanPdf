package com.shubham.loanpdf.model;

public class BusinessDetails
{
    private String ApplicantName,
            IncorporationDate ,
            ConstitutionType ,
            CompanyPAN ,
            City,
            RegisteredAddress,
            CorrespondenceAddress ,
            TypeOfBusiness ,
            EmailApplicant,
            PhoneApplicant,
            TurnOver ;

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public String getIncorporationDate() {
        return IncorporationDate;
    }

    public void setIncorporationDate(String incorporationDate) {
        IncorporationDate = incorporationDate;
    }

    public String getConstitutionType() {
        return ConstitutionType;
    }

    public void setConstitutionType(String constitutionType) {
        ConstitutionType = constitutionType;
    }

    public String getCompanyPAN() {
        return CompanyPAN;
    }

    public void setCompanyPAN(String companyPAN) {
        CompanyPAN = companyPAN;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegisteredAddress() {
        return RegisteredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        RegisteredAddress = registeredAddress;
    }

    public String getCorrespondenceAddress() {
        return CorrespondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
        CorrespondenceAddress = correspondenceAddress;
    }

    public String getTypeOfBusiness() {
        return TypeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        TypeOfBusiness = typeOfBusiness;
    }

    public String getEmailApplicant() {
        return EmailApplicant;
    }

    public void setEmailApplicant(String emailApplicant) {
        EmailApplicant = emailApplicant;
    }

    public String getPhoneApplicant() {
        return PhoneApplicant;
    }

    public void setPhoneApplicant(String phoneApplicant) {
        PhoneApplicant = phoneApplicant;
    }

    public String getTurnOver() {
        return TurnOver;
    }

    public void setTurnOver(String turnOver) {
        TurnOver = turnOver;
    }
}
