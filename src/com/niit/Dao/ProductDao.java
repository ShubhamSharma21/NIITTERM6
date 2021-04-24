package com.niit.Dao;

import java.util.List;

import com.niit.Model.Category;
import com.niit.Model.Product;

public interface ProductDao  {
	
	boolean addProduct(Product product);
	
	public List<Product>getAllproduct();
	
	public List<Product>getCategoryimg(int getimage);
	
    public Product getProductById(int Pid);
	 
    public boolean deleteProduct(int Productid);
   
    boolean updateProduct(Product product);


}
