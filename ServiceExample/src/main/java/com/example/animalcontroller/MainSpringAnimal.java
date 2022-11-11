package com.example.animalcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.example.Animals","commoini"} )
public class MainSpringAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainSpringAnimal.class, args);
	}

}
