package com.example.Configuration;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Iphone I12 = factory.getBean(Iphone.class);
		I12.config();
		
	}

}
