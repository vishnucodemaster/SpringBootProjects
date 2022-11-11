package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ServiceExampleApplication {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context
         = new AnnotationConfigApplicationContext();
     context.scan("com.example.demo");

     context.refresh();

     MyServiceClass myServiceClass
          = context.getBean(MyServiceClass.class);

     // Testing the factorial method
     int factorialOf5 = myServiceClass.factorial(5);
     System.out.println("Factorial of 5 is: "
                        + factorialOf5);

     // Closing the spring context
     // using close() method
     context.close();
	}

}
