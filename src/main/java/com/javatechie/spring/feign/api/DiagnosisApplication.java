package com.javatechie.spring.feign.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class DiagnosisApplication {


	@GetMapping("/getDiagnosis")
	public String getDianosis() {
		return "Diagnosis microservice called ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisApplication.class, args);
	}

}
