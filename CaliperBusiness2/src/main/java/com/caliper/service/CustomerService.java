package com.caliper.service;

import java.util.List;

import com.caliper.model.Customers;

public interface CustomerService {

	public Customers createCust(Customers cust);

	public Customers getCustById(Integer id);

	public List<Customers> getAllCust();

	public Customers updateCust(Integer id);

	public String deleteCust(Integer id);

}
