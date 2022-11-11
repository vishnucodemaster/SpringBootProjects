package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"Repository","EmployeeController","Entity","EmployeeService"} )
@EnableJpaRepositories("Repository")
@EntityScan(basePackages = {"Entity"})
public class SpringDemoExampleforentityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoExampleforentityApplication.class, args);
	}

}
