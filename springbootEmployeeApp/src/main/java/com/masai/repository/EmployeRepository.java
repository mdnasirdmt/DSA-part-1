package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
