package com.example.Animals;

import org.springframework.stereotype.Service;



@Service
public class Cat implements Animal {
	@Override
	public String characteristics() {
		return "Meow";
		}
}
