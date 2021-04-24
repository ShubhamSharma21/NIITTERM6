package com.niit.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.osgi.service.component.annotations.Component;

@Entity
@Component
@Table(name="category")

public class Category{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int catid;
	
	@OneToMany(mappedBy="category", fetch=FetchType.EAGER, cascade= CascadeType.REMOVE)
	Set<Product>product;
	
	//@Column(unique=true)
	String catname;
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	String catdesc;
	
	
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public String getCatdesc() {
		return catdesc;
	}
	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}

}
