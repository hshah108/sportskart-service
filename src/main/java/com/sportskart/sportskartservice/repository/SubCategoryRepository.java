package com.sportskart.sportskartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sportskart.sportskartservice.model.SubCategory;

@Repository
public interface SubCategoryRepository extends MongoRepository<SubCategory, Long>{

}
