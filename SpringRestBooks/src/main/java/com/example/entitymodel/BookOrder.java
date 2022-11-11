package com.example.entitymodel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Table
@Entity
@Data
public class BookOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	private String book_name; 
}
