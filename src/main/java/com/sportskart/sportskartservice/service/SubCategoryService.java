package com.sportskart.sportskartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportskart.sportskartservice.model.SubCategory;
import com.sportskart.sportskartservice.repository.SubCategoryRepository;

@Service
public class SubCategoryService {

	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	public List<SubCategory> getAllSubCategories() {
		return subCategoryRepository.findAll();
	}

}
