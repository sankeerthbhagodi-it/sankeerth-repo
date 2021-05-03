package com.supremo.healthcare;

import com.supremo.healthcare.dao.HospitalRepository;
import com.supremo.healthcare.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class HealthcareApplication implements CommandLineRunner {

	@Autowired
	HospitalRepository hospitalRepository;

	public static void main(String[] args) {
		SpringApplication.run(HealthcareApplication.class, args);
		System.out.println("Testing");
	}

	@Override
	public void run(String... args) {
		System.out.println("Inside Run");
		List<Hospital> all = hospitalRepository.findAll();
		all.forEach(System.out :: println);
	}
}
