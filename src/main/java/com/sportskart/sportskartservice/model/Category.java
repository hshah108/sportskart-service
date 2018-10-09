package com.sportskart.sportskartservice.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
//@Table(name="CATEGORY")
@Document
public class Category implements Serializable{

	Integer categoryId;
	String categoryName;
	String categoryGroup;
	
	
}
