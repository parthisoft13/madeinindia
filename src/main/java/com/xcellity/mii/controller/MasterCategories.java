package com.xcellity.mii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcellity.mii.pojo.CategoryMaster;
import com.xcellity.mii.service.CategoryService;


@RestController
@RequestMapping("/api/v1")
public class MasterCategories {
	@Autowired
	CategoryService categoryService;
	
	
	
	  @GetMapping("/categories")
	    public List<CategoryMaster> getAirPort() {
	    	List<CategoryMaster> response = 	categoryService.getCategory();
			return response;
	    }
	

}
