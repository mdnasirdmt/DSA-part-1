package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.User;
import com.masai.exception.ResourceNotFound;
import com.masai.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	// get all user
	// get user by id
	// update user
	// delete user by id

	@Autowired
	private UserRepository userRepository;

	// get all user
	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();

	}

	// user by id
	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value = "id") Integer id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound("user not found by this id to display" + id));

	}

//	create user
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);

	}

	// update user
	@PutMapping("/id")
	public User updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
		User exsitUser = userRepository.findById(id).orElseThrow(
				() -> new ResourceNotFound("user not found by this id to update try with diffrent id " + id));

		exsitUser.setFirstName(user.getFirstName());
		exsitUser.setLastName(user.getLastName());
		exsitUser.setEmail(user.getEmail());

		userRepository.save(exsitUser);

		return exsitUser;

	}

	// delete user by id
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id) {
		User exsitUser = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound("user not found by this id to delete " + id));
		userRepository.delete(exsitUser);
		return ResponseEntity.ok().build();
	}

}
