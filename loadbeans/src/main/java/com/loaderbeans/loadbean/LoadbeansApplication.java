package com.loaderbeans.loadbean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication(scanBasePackages = { "com.loaderbeans" })
public class LoadbeansApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoadbeansApplication.class, args);

	}

	/** defining the bean for message properties */
	@Bean
	public MessageSource messageSource(){

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages/Messages","messages/validation-messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	


}
