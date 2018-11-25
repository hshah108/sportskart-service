package com.sportskart.sportskartservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportskart.sportskartservice.model.Category;
import com.sportskart.sportskartservice.service.CategoryService;


@RestController
@CrossOrigin(origins="*")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	private Logger logger = LoggerFactory.getLogger(CategoryController.class);
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		logger.debug("calling category service ");
		List<Category> categories = categoryService.getAllCategories();
		logger.debug("retrieved categories : " + categories);
		return categoryService.getAllCategories();
	}
	
}
