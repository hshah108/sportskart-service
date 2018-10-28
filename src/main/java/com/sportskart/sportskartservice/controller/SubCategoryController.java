package com.sportskart.sportskartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportskart.sportskartservice.model.SubCategory;
import com.sportskart.sportskartservice.service.SubCategoryService;

@RestController
@CrossOrigin(origins="*")
public class SubCategoryController {

	@Autowired
	SubCategoryService subCategoryService;
	
	@GetMapping("/subCategories")
	public List<SubCategory> getAllSubCategories(){
		return subCategoryService.getAllSubCategories();
	}
	
}
