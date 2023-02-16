package com.bakis.etic.backend.dao;

import java.util.List;

import com.bakis.etic.backend.dto.Category;

public interface CategoryDao {
	List<Category> list(); 
	Category get(int id);
	
	boolean add(Category cat);
	boolean update(Category cat);
	boolean delete(Category cat); 

}
