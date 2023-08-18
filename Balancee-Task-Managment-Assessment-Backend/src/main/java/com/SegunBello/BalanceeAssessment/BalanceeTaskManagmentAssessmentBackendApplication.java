package com.SegunBello.BalanceeAssessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BalanceeTaskManagmentAssessmentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceeTaskManagmentAssessmentBackendApplication.class, args);
	}

}
