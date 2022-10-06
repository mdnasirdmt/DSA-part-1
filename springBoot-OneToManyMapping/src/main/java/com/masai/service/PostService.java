package com.masai.service;

import java.util.List;

import com.masai.entity.Post;

public interface PostService {

	public Post createPost(Post post);

	public Post getPostById(Integer id);

	public List<Post> getAllPost();

	public Post updatePost(Post post, Integer id);

	public String deletePost(Integer id);

}
