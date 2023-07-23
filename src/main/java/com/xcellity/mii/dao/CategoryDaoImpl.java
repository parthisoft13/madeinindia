package com.xcellity.mii.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xcellity.mii.entity.CategoryEntity;
import com.xcellity.mii.pojo.CategoryMaster;
import com.xcellity.mii.repository.CategoryRepository;

public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	CategoryRepository repository;

	@Override
	public List<CategoryEntity> getCategoryDao() {
		
		
		List<CategoryEntity> entity = repository.findAll();
 		
		
		
		return entity;
	}
	
	

}
