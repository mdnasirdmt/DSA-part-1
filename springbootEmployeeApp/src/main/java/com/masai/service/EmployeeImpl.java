package com.masai.service;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.repository.AddressRepository;
import com.masai.repository.EmployeRepository;

public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeRepository empRepository;
	@Autowired
	private AddressRepository addRepository;

	@Override
	public Employee createEmp(Employee employee) {

		Address address = new Address();

		address.setStreet(employee.getAddress().getStreet());
		address.setState(employee.getAddress().getState());
		address.setCountry(employee.getAddress().getCountry());

		addRepository.save(address);

		employee.setAddress(address);

		return (empRepository.save(employee));

	}

	@Override
	public Employee getEmpById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmp(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
