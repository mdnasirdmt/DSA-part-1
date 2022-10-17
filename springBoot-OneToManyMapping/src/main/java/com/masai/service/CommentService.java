package com.masai.service;

import java.util.List;

import com.masai.entity.Comment;
import com.masai.entity.CommentDto;
import com.masai.entity.Post;
import com.masai.exception.ResourceNotFound;

public interface CommentService {

	public Comment createComment(Comment comment);
	
	public CommentDto getCommentIdAndTextById(Integer id) throws ResourceNotFound;
	

}
