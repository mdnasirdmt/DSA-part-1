package com.masai.service;

import java.util.List;

import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee createEmp(Employee employee);
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getAllEmp();
	
	public Employee updateEmp(Integer id);
	
	public String deleteEmp(Integer id);
	

}
