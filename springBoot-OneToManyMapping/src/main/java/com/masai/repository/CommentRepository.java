package com.masai.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.entity.Comment;
import com.masai.entity.CommentDto;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

	@Query("select new com.masai.entity.CommentDto(t.id,t.text) from Comment t where t.id=?1")
	public CommentDto fun1(int id);
	
}
