package com.example.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.autowired.*;
import com.example.spring.Service.*;



@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
//@GetMapping("/customers")
	@RequestMapping(value="/customers")

	public List<Customer> getList() {
		return cService.getCustomerList();
	}
}