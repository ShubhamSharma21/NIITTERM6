package com.niit.Dao;

import java.util.List;

import com.niit.Model.CustomerDetails;

public interface CustomerDao {
	
	boolean addcustomerDetails(CustomerDetails cd);
	
	boolean deletecustomerDetails(CustomerDetails customerusername);
	boolean updateCustomerDetail(CustomerDetails customer);
	public CustomerDetails getCustomerById(int dataid);
	
	public List<CustomerDetails>getAllUser();
    public List<CustomerDetails>getcustomerByusername(String username);
    
    public CustomerDetails validate (String emailid, String password);
}

