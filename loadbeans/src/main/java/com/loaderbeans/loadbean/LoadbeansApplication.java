package com.loaderbeans.loadbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.loaderbeans" })
public class LoadbeansApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoadbeansApplication.class, args);

	}


}
