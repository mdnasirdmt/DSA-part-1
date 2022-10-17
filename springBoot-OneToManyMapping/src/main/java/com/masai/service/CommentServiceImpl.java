package com.masai.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.entity.Comment;
import com.masai.entity.CommentDto;
import com.masai.exception.ResourceNotFound;
import com.masai.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public Comment createComment(Comment comment) {

		return commentRepository.save(comment);
	}

	@Override
	public CommentDto getCommentIdAndTextById(Integer id) throws ResourceNotFound {
		
		CommentDto re=  commentRepository.fun1(id);
	
		if(re!=null)
			return re;
		else
			throw new ResourceNotFound("comment not found by id :"+ id);
	}



	


}
