package com.example.JavaCRUDs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JavaCruDsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCruDsApplication.class, args);
	}
}
