package com.masai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@Size(min = 2, message = "First name should have atleat 2 charachters")
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Size(min = 2, message = "Last name should have atleast 2 charachters")
	@Column(name = "last_name")
	private String lastName;

	@NotBlank
	@Email
	@Column(name = "email_Id")
	private String email;

}
