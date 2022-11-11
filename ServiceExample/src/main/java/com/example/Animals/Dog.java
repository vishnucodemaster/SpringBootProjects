package com.example.Animals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class Dog implements Animal {
	@Override
	public String characteristics() {
		return "Bark";
		}

}
