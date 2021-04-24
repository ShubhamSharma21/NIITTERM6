package com.niit.Dao;

import java.util.List;

import com.niit.Model.Cart;
import com.niit.Model.CartItem;

public interface CartDAO {
	
	public boolean addcustomer(int customerId); 
	

	
	public boolean delcart(int customerId);
	
	public Cart getCart(int customerId);
	
	public int getCartId(int customerId);
	
	//CartItem-------
	
	public boolean addproduct(int productId, int customerId);
	
	public boolean removeproduct(int productId, int customerId);
	
	public boolean updatequantity(int productId, int qty, int customerId);
	
	public List<CartItem> getItemList(int cartId);
	
	

}
