package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(min=6)
	Integer empId;
	
	@NotNull
	@Size(min=2, max=50)
	String firstName;
	
	@NotNull
	@Size(min=2, max=50)
	String lastName;
	
	@NotNull
    @Pattern(
            regexp = "(^([+]\\d{2}([ ])?)?\\d{10}$)",
            message = "Number should be in format: {+91 1234567890, +911234567890, 1234567890}")
	Integer cell_phone;
	
	@ManyToOne
    private Address address;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(Integer cell_phone) {
		this.cell_phone = cell_phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
