package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.entity.Comment;
import com.masai.entity.Post;
import com.masai.repository.PostRepository;

@SpringBootApplication
public class SpringBootOneToManyMappingApplication {
//	implements CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyMappingApplication.class, args);
	}

//	@Autowired
//	private PostRepository postrepository;

//	@Override
//	public void run(String... args) throws Exception {

//		Post post = new Post("Instagram post", "hello frnds chai pilo");
//
//		Comment comment1 = new Comment("nice pic");
//		Comment comment2 = new Comment("nice post");
//		Comment comment3 = new Comment("waah waah");
//		Comment comment4 = new Comment("future star");
//
//		post.getComments().add(comment1);
//		post.getComments().add(comment2);
//		post.getComments().add(comment3);
//		post.getComments().add(comment4);
//
//		postrepository.save(post);

//	}

}
