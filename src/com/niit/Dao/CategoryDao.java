package com.niit.Dao;

import java.util.List;

import com.niit.Model.Category;
import com.niit.Model.CustomerDetails;

public interface CategoryDao {
	boolean addCategory(Category category);
	
    public boolean deleteCategory(int catid);
	
    public List<Category>getAllCategory();
	public Category getCategoryById(int catid);

	boolean updateCategory(Category category);
	
}
