package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_comnt_fid", referencedColumnName = "id")
	List<Comment> comments = new ArrayList<>();

	public Post(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

}
