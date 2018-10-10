package com.sportskart.sportskartservice.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Document(collection="category")
public class Category implements Serializable{
	
	String categoryId;
	String code;
	String displayText;
}
