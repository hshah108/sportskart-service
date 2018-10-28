package com.sportskart.sportskartservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SubCategory {

	Long subCategoryId;
	Long categoryId;
	String itemCode;
	String displayText;
}
