package com.loaderbeans.loadbean;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoadbeansApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(LoadbeansApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(LoadbeansApplication.class, args);
		
	}

	@Autowired
	private ApplicationContext appContext;

	@Override
	public void run(String...args){
		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);

		
		for(String bean :beans){
			System.out.println(bean+"  of Type::   "+appContext.getBean(bean).getClass());
			System.out.println(" ");
			
		}
	}

}
