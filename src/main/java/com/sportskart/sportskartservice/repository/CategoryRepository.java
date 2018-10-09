package com.sportskart.sportskartservice.repository;

import org.springframework.stereotype.Repository;

import com.sportskart.sportskartservice.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Long>{

}
