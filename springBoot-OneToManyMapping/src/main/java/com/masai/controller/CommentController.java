package com.masai.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Comment;
import com.masai.entity.CommentDto;
import com.masai.entity.Post;
import com.masai.service.CommentService;

@RequestMapping("/api/comments")
@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;

	// create post api // http://localhost:8080/api/comments
	@PostMapping
	public ResponseEntity<Comment> savePost(@RequestBody Comment comment) {

		return new ResponseEntity<Comment>(commentService.createComment(comment), HttpStatus.CREATED);

	}	
	
	
	@GetMapping("/{id}")
	public CommentDto getCommentIdAndIdByIdHandler(@PathVariable("id") Integer id) {
		
		return commentService.getCommentIdAndTextById(id);
	}

}
