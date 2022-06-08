package com.shubham.loanpdf.controller;

import com.shubham.loanpdf.model.*;
import com.shubham.loanpdf.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RegisterGenerateController {
    Map<String, Object> data = new HashMap<>();


    String templateType;

    @Autowired
    GenerateService generateService;


    //post type of template
    @PostMapping("/register")
    public String postDataPdf(@RequestBody Map<String,String> receivedData)
    {
        templateType = receivedData.get("template") ;
        return templateType;
    }

    //getting data (required or show what received)
    @GetMapping("/register")
    public Map<String, Object> getData()
    {

        if(templateType.equals("temp1"))
        {

            data.put("applicationDetails", new ApplicationDetails());
            data.put("bankDetails", new BankDetails());
            data.put("businessDetails", new BusinessDetails());
            data.put("loanDetails", new LoanDetails());
            data.put("coApplicantDetails", new CoApplicantDetails());
            data.put("gstDetails" , new GstDetails());
            data.put("gsft" , new GSFT());
            data.put("emidetails" , new EMIdetails() );
            data.put("facilityDeatils" , new FacilityDetails());
        }
        else if(templateType.equals("temp2"))
        {
            data.put("schedule" , new ScheduleData());
        }
        else
        {
            System.out.println("error Null");
        }
       return data;
    }


    @PostMapping("/gen")
    public Map<String, Object> putData(@RequestBody Map<String, Object> receivedData)
    {


        if(templateType.equals("temp1")) {
            data.put("applicationDetails", receivedData.get("applicationDetails"));
            data.put("bankDetails", receivedData.get("bankDetails"));
            data.put("businessDetails", receivedData.get("businessDetails"));
            data.put("loanDetails", receivedData.get("loanDetails"));
            data.put("coApplicantDetails", receivedData.get("coApplicantDetails"));
            data.put("gstDetails", receivedData.get("gstDetails"));
            data.put("gsft", receivedData.get("gsft"));
            data.put("emidetails", receivedData.get("emidetails"));
            data.put("facilityDeatils", receivedData.get("facilityDeatils"));

            generateService.generateFile("loantemplate", null, data, "LoanPdf.pdf");
        }
        else if(templateType.equals("temp2"))
        {
            data.put("schedule" , receivedData.get("schedule"));
            generateService.generateFile(null,"LoanAgreement", data, "LoanPdf.pdf");

        }



        return data;
    }

    @GetMapping("/gen")
    public String check()
    {
        return "OK";
    }



}
