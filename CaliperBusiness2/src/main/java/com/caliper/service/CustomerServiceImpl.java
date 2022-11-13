package com.caliper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caliper.exceptions.CustomerNotFound;
import com.caliper.model.Address;
import com.caliper.model.Customers;
import com.caliper.repository.AddressRepository;
import com.caliper.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Customers createCust(Customers cust) {

		Address add = new Address();
		add.setStreet(cust.getAddress().getStreet());
		add.setCity(cust.getAddress().getCity());
		add.setState(cust.getAddress().getState());
		add.setCountry(cust.getAddress().getCountry());

		cust.setAddress(add);
		addressRepository.save(add);

		return customerRepository.save(cust);
	}

	@Override
	public Customers getCustById(Integer id) {

		return customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFound("customer not found by this id to display " + id));
	}

	@Override
	public List<Customers> getAllCust() {

		return customerRepository.findAll();
	}

	@Override
	public Customers updateCust(Integer id) {
		Customers exsit = customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFound("customer not found to update please enter again !"));
		exsit.setCustomerName(exsit.getCustomerName());

		customerRepository.save(exsit);

		return exsit;
	}

	@Override
	public String deleteCust(Integer id) {
		customerRepository.findById(id).orElseThrow(() -> new CustomerNotFound("customer not found to delete !"));

		customerRepository.deleteById(id);

		return "customer deleted successfully !";
	}

}
