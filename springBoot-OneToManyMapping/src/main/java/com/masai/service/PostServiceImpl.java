package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Comment;
import com.masai.entity.Post;
import com.masai.exception.ResourceNotFound;
import com.masai.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;

	@Override
	public Post createPost(Post post) {

		return postRepository.save(post);

	}

//	@Override
//	public Post getPostById(Integer id) {
//
//		
//		return postRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFound("post not found by this id to show " + id));
//	}
//
//	@Override
//	public List<Post> getAllPost() {
//
//		return postRepository.findAll();
//	}
//
//	@Override
//	public Post updatePost(Post post, Integer id) {
//
//		Post exsist = postRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFound("post not found by this id to update " + id));
//		exsist.setTitle(post.getTitle());
//		exsist.setDescription(post.getDescription());
//
//		postRepository.save(exsist);
//
//		return exsist;
//	}
//
//	@Override
//	public String deletePost(Integer id) {
//		postRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFound("post not found by this id to delete " + id));
//		return "post delete successfully ";
//	}

}
