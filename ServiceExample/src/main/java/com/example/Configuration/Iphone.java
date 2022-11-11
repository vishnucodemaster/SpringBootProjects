package com.example.Configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Iphone {
	@Autowired
	MobileProcessor cpu;
	

	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		// TODO Auto-generated method stub
		System.out.println("Octa Core,4 gb Ram,12MP camera");
		cpu.process();
	}

}
