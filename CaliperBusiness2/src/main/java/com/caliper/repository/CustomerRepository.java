package com.caliper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caliper.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
