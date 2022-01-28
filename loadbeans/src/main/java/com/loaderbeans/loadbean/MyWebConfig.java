package com.loaderbeans.loadbean;

import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class MyWebConfig {

    private MessageSource messageSource;

    public MyWebConfig(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    
    public Validator getValidator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource);
        return validator;
    }
}
