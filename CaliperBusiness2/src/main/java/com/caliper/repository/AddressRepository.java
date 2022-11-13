package com.caliper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caliper.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
