package com.supremo.healthcare;

import com.supremo.healthcare.dao.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HealthcareApplication {

	@Autowired
	HospitalRepository hospitalRepository;

	public static void main(String[] args) {
		SpringApplication.run(HealthcareApplication.class, args);
		System.out.println("Started");
	}

}
