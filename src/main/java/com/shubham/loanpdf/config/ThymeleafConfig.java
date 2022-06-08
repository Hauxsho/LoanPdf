package com.shubham.loanpdf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafConfig {
    @Bean
    public ClassLoaderTemplateResolver templateResolver()
    {
        ClassLoaderTemplateResolver pdfTemplateResolver = new ClassLoaderTemplateResolver();
        //find the Html template in the project
        pdfTemplateResolver.setPrefix("templates/");
        pdfTemplateResolver.setSuffix(".html");
        pdfTemplateResolver.setTemplateMode(TemplateMode.HTML);
        pdfTemplateResolver.setCharacterEncoding("UTF-8");
        pdfTemplateResolver.setOrder(1);

        return pdfTemplateResolver;
    }
}
