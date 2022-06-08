package com.shubham.loanpdf;

import com.shubham.loanpdf.model.*;
import com.shubham.loanpdf.service.GenerateService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


/*
@Component
public class GenRunner implements CommandLineRunner {

    @Autowired
    private GenerateService generateService;

    @Override
    public void run(String... args) throws Exception
    {
        Map<String, Object> data = new HashMap<>();

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("src/main/resources/Json/DataTest.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            JSONObject objectJ = (JSONObject) jsonObject.get("data");


            ApplicationDetails applicationDetails = new ApplicationDetails();
            JSONObject applicationDetailsObj = (JSONObject) objectJ.get("applicationDetails");
            String applicationNumber = (String) applicationDetailsObj.get("applicationNumber");
            applicationDetails.setApplicationNumber(applicationNumber);
            String applicationDate = (String) applicationDetailsObj.get("applicationDate");
            applicationDetails.setDate(applicationDate);
            data.put("applicationDetails" , applicationDetails);

            BankDetails bankDetails = new BankDetails();
            JSONObject bankDetailsObj = (JSONObject) objectJ.get("bankDetails");
            String BankName = (String) bankDetailsObj.get("BankName");
            bankDetails.setBankName(BankName);
            String AccountNumber = (String) bankDetailsObj.get("AccountNumber");
            bankDetails.setAccountNumber((AccountNumber));
            String AccountType = (String) bankDetailsObj.get("AccountType");
            bankDetails.setAccountType(AccountType);
            String IFSCcode = (String) bankDetailsObj.get("IFSCcode");
            bankDetails.setIFSCcode(IFSCcode);
            data.put("bankDetails" , bankDetails);


            BusinessDetails businessDetails = new BusinessDetails();
            JSONObject businessDetailsObj = (JSONObject) objectJ.get("businessDetails");
            String ApplicantName = (String) businessDetailsObj.get("ApplicantName");
            businessDetails.setApplicantName(ApplicantName);
            String City = (String) businessDetailsObj.get("City");
            businessDetails.setCity(City);
            String CompanyPan = (String) businessDetailsObj.get("CompanyPan");
            businessDetails.setCompanyPAN(CompanyPan);
            String TypeOfBusiness = (String) businessDetailsObj.get("TypeOfBusiness");
            businessDetails.setTypeOfBusiness(TypeOfBusiness);
            String IncorporationDate = (String) businessDetailsObj.get("IncorporationDate");
            businessDetails.setIncorporationDate(IncorporationDate);
            String ConstitutionType = (String) businessDetailsObj.get("ConstitutionType");
            businessDetails.setConstitutionType(ConstitutionType);
            String RegisteredAddress = (String) businessDetailsObj.get("RegisteredAddress");
            businessDetails.setRegisteredAddress(RegisteredAddress);
            String CorrespondenceAddress = (String) businessDetailsObj.get("CorrespondenceAddress");
            businessDetails.setCorrespondenceAddress(CorrespondenceAddress);
            String EmailApplicant = (String) businessDetailsObj.get("EmailApplicant");
            businessDetails.setEmailApplicant(EmailApplicant);
            String TurnOver = (String) businessDetailsObj.get("TurnOver");
            businessDetails.setTurnOver(TurnOver);
            String PhoneApplicant = (String) businessDetailsObj.get("PhoneApplicant");
            businessDetails.setPhoneApplicant((PhoneApplicant));
            data.put("businessDetails" ,  businessDetails);


            LoanDetails loanDetails = new LoanDetails();
            JSONObject loanDetailsObj = (JSONObject) objectJ.get("loanDetails");
            String LoanAmount = (String) loanDetailsObj.get("LoanAmount");
            loanDetails.setLoanAmount((LoanAmount));
            String LoanPurpose = (String) loanDetailsObj.get("LoanPurpose");
            loanDetails.setLoanPurpose(LoanPurpose);
            String LoanTenor = (String) loanDetailsObj.get("LoanTenor");
            loanDetails.setLoanTenor((LoanTenor));
            data.put("loanDetails" ,loanDetails);


            Path path = Paths.get("src/main/resources/static/TestImg.png");
            CoApplicantDetails coApplicantDetails = new CoApplicantDetails();
            JSONObject coApplicantDetailsObj = (JSONObject) objectJ.get("coApplicantDetails");
            coApplicantDetails.setCoappImg(path.toUri().toString());
            String CoAppName = (String) coApplicantDetailsObj.get("CoAppName");
            coApplicantDetails.setCoappName(CoAppName);
            String CoAppDOB = (String) coApplicantDetailsObj.get("CoAppDOB");
            coApplicantDetails.setCoappDOB(CoAppDOB);
            String CoAppGender = (String) coApplicantDetailsObj.get("CoAppGender");
            coApplicantDetails.setCoappGender(CoAppGender);
            String CoAppPAN = (String) coApplicantDetailsObj.get("CoAppPAN");
            coApplicantDetails.setCoappPAN(CoAppPAN);
            String CoAppPermanentAddress = (String) coApplicantDetailsObj.get("CoAppPermanentAddress");
            coApplicantDetails.setCoappPermanentAddress(CoAppPermanentAddress);
            String CoAppCorrespondenceAddress = (String) coApplicantDetailsObj.get("CoAppCorrespondenceAddress");
            coApplicantDetails.setCoappCorespondenceAddress(CoAppCorrespondenceAddress);
            String CoAppFatherName = (String) coApplicantDetailsObj.get("CoAppFatherName");
            coApplicantDetails.setCoappFatherName(CoAppFatherName);
            String CoAppPhoneNumber = (String) coApplicantDetailsObj.get("CoAppPhoneNumber");
            coApplicantDetails.setCoappPhoneNumber((CoAppPhoneNumber));
            String CoAppEmail = (String) coApplicantDetailsObj.get("CoAppEmail");
            coApplicantDetails.setCoappEmail(CoAppEmail);
            data.put("coApplicantDetails" , coApplicantDetails);

            // loop array
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }


        generateService.generateFile("loantemplate", data, "LoanPdf.pdf");


    }
}


 */
