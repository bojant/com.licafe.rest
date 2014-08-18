package com.licafe.dao;

import com.licafe.data.model.Customer;

public interface CustomerDao {

	public void Login(Customer customer);
	public void Register(Customer customer);

	public Customer getCustomerDetails(String username);
}