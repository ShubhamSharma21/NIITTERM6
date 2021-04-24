package com.niit.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.osgi.service.component.annotations.Component;

@Entity
@Component
@Table(name="product")

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private int catid=0;
	@ManyToOne
	@JoinColumn(name="catid", insertable=false, nullable=false, updatable=false)
	private Category category;
	
	
	
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	@Column(unique=true)
	private String name;
	private String description;
	private int qty;
	private int price;
	String img;

   @OneToMany(mappedBy="product", fetch=FetchType.EAGER, cascade= CascadeType.REMOVE)
   Set<CartItem> CartItem;
	
	
	
	public Set<CartItem> getCartItem() {
	return CartItem;
}
public void setCartItem(Set<CartItem> cartItem) {
	CartItem = cartItem;
}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {  
		
		return name;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

