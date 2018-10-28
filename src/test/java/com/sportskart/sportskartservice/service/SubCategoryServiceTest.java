package com.sportskart.sportskartservice.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sportskart.sportskartservice.model.SubCategory;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SubCategoryServiceTest {

	@Autowired
	SubCategoryService subCategoryService;
	
	@Test
	public void testGetAllSubCategories() {
		List<SubCategory> subCategories = subCategoryService.getAllSubCategories();
		Assert.assertNotNull("SubCategories could not be retrieved!!", subCategories);
	}
}
