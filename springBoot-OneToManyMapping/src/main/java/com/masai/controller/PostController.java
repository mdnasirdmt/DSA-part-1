package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Comment;
import com.masai.entity.Post;
import com.masai.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	private PostService postService;

	// create post api // http://localhost:8080/api/posts
	@PostMapping
	public ResponseEntity<Post> savePost(@RequestBody Post post) {
		
		return new ResponseEntity<Post>(postService.createPost(post), HttpStatus.CREATED);

	}
	
	
}
