package com.niit.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.osgi.service.component.annotations.Component;

@Entity

@Component
@Table(name="cart")

public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cartId;
	int grandTotal;
	int customerId;
	@OneToOne
	@JoinColumn(name="customerId",insertable=false,updatable=false,nullable=false)
	CustomerDetails customerDetails;
	
	 @OneToMany(mappedBy="cart", fetch=FetchType.EAGER, cascade= CascadeType.REMOVE)
	   Set<CartItem> CartItem;
	
	
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public Set<CartItem> getCartItem() {
		return CartItem;
	}
	public void setCartItem(Set<CartItem> cartItem) {
		CartItem = cartItem;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

}
