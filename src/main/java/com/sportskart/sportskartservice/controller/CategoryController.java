package com.sportskart.sportskartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportskart.sportskartservice.model.Category;
import com.sportskart.sportskartservice.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
}
