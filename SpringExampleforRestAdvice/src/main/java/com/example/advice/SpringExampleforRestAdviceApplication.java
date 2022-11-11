package com.example.advice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.restcontroller"} )

public class SpringExampleforRestAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleforRestAdviceApplication.class, args);
	}

}
