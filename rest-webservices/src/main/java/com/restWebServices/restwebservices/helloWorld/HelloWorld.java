package com.restWebServices.restwebservices.helloWorld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorld {

    private MessageSource messageSource;

    public HelloWorld(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    @GetMapping("/hello-world")
    private String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-i18n")
    private String HelloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, null, locale);
    }
}
