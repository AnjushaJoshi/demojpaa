package com.example.demojpaa.controller;

import com.example.demojpaa.model.Category;
import com.example.demojpaa.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepo categoryRepo;
    @PostMapping(value="/savecategory")
    public String saveCategory(@RequestBody Category category){
        categoryRepo.save(category);
        return "Category saved";
    }
}

