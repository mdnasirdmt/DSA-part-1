package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tId;

	private String title;

	private String description;

	private String status;

	private String priority;

	private Integer assigned_employee_id;

}
