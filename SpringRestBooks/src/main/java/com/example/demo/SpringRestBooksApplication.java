package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.bookcontroller","com.example.bookservice","com.example.entitymodel","com.example.DAO"} )
@EnableJpaRepositories("com.example.DAO")
@EntityScan(basePackages = {"com.example.entitymodel"})
public class SpringRestBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestBooksApplication.class, args);
	}

}
