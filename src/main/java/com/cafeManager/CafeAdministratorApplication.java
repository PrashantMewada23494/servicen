package com.cafeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages = "com.cafeManager")
public class CafeAdministratorApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CafeAdministratorApplication.class);
	}
	
	public static void main(String[] args) {	
		
		SpringApplication.run(CafeAdministratorApplication.class, args);
	}

}
