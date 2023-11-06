package com.microservice.Bdki.buypay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication @EnableJpaAuditing
public class BdkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdkiApplication.class, args);
	}

}
