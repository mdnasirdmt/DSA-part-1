package com.caliper.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customers {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Size(min = 6)
	private Integer customerId;

	@NotNull
	@Size(min = 2, max = 50)
	private String customerName;

	@NotNull
	@Pattern(regexp = "[6789]{1}[0-9]{9}",message = "Invalid Phone Number")
	private String customerPhone;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

}
