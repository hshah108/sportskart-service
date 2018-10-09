package com.sportskart.sportskartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportskart.sportskartservice.model.Category;
import com.sportskart.sportskartservice.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

}
