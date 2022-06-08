package com.shubham.loanpdf.service;


import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;

@Service
public class GenerateService {

    @Autowired
    private TemplateEngine templateEngine;

    @Value("${pdf.directory}")
    private String pdfDirectory ;

    public void generateFile(String temp1, String temp2, Map<String, Object> data, String pdfFileName) {

        Context context = new Context();
        context.setVariables(data);
        String secondTemplate = "";
        String htmlContent = "";

        if(temp1 != null) {
            htmlContent = templateEngine.process(temp1, context).replaceAll("&(?!amp;)", "&amp;");;
        }
        if(temp2 != null) {
            secondTemplate = templateEngine.process(temp2 , context).replaceAll("&(?!amp;)", "&amp;");;

        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pdfDirectory + pdfFileName); //specifing location and name of pdf FIle
            ITextRenderer renderer = new ITextRenderer();
            if(temp1==null && secondTemplate !=null)
            {
                renderer.setDocumentFromString(secondTemplate); //rendering it from to html
                renderer.layout();
                renderer.createPDF(fileOutputStream, false); //creating pdf in file

            }
            else if(temp2==(null) && htmlContent!=(null) )
            {
                renderer.setDocumentFromString(htmlContent); //rendering it from to html
                renderer.layout();
                renderer.createPDF(fileOutputStream, false); //creating pdf in file

            }
            else
            {
                renderer.setDocumentFromString(htmlContent); //rendering it from to html
                renderer.layout();
                renderer.createPDF(fileOutputStream, false); //creating pdf in file

                renderer.setDocumentFromString(secondTemplate);
                renderer.layout();
                renderer.writeNextDocument();
            }


            /*
            renderer.setDocumentFromString(htmlContent); //rendering it from to html
            renderer.layout();
            renderer.createPDF(fileOutputStream, false); //creating pdf in file

            renderer.setDocumentFromString(secondTemplate);
            renderer.layout();
            renderer.writeNextDocument();

             */

            renderer.finishPDF();
        }
        //Handling exceptions
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage()+ "File");
        } catch (DocumentException e) {
            System.out.println(e.getMessage() + "Doc");
        }

    }


}
