package com.masai.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Urls {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String actual_url;
	private String short_url;
	private Date expiry;

}
