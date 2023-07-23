package com.xcellity.mii.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcellity.mii.dao.CategoryDao;
import com.xcellity.mii.entity.CategoryEntity;
import com.xcellity.mii.pojo.CategoryMaster;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDao categoryDao;

	@Override
	public List<CategoryMaster> getCategory() {
		
		List<CategoryEntity> category = categoryDao.getCategoryDao();
List<CategoryMaster> category_master =  new ArrayList<>();
		
		return category_master;
	}

}
