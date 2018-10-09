package com.sportskart.sportskartservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
//@Table(name="CATEGORY")
@Document
public class Category implements Serializable{

	@Id
	Integer categoryId;
	String categoryName;
	String categoryGroup;
	
	
}
