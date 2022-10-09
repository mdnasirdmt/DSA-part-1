package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Comment;
import com.masai.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{
	
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public Comment createComment(Comment comment) {
		
		return commentRepository.save(comment);
	}


	

}
