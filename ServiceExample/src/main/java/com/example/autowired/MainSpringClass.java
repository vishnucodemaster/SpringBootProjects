package com.example.autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.spring.Service","com.example.spring.controller"} )
public class MainSpringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainSpringClass.class, args);

	}

}
