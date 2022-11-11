package com.example.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
/*
 * <beans>
 * <bean id ="phone" class="Iphone"/>	</bean>
 */
	@Bean
	public Iphone getPhone()
	{
		return new Iphone();
	}
	@Bean
	public MobileProcessor getProcessor()
	{
		return new Snapdragon();
	}
}
