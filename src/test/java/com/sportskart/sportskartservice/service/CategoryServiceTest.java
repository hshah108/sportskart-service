package com.sportskart.sportskartservice.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sportskart.sportskartservice.model.Category;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {

	@Autowired
	CategoryService categoryService;
	
	@Test
	public void testGetAllCategories() {
		List<Category> categories = categoryService.getAllCategories();
		Assert.assertNotNull("Categories could not be retrieved!!", categories);
	}
}
