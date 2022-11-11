package com.masai.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Task;
//import com.masai.service.TaskService;
import com.masai.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	// create task api // http://localhost:8080/api/task
	@PostMapping
	public ResponseEntity<Task> savePost(@RequestBody Task task) {

		return new ResponseEntity<Task>(taskService.createTask(task), HttpStatus.CREATED);

	}

	// get by id
	@GetMapping("{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable("id") Integer id) {

		return new ResponseEntity<Task>(taskService.getTaskById(id), HttpStatus.OK);
	}

	// get all task

	@GetMapping
	public List<Task> getBook() {

		return taskService.getAllTask();
	}

	// to update
	@PutMapping("{id}")
	public ResponseEntity<Task> updateBook(@PathVariable("id") Integer id, @RequestBody Task task) {

		return new ResponseEntity<Task>(taskService.updateTask(id), HttpStatus.OK);
	}

	// to delete
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTask(@PathVariable("id") Integer id) {

		// delete task from db
		taskService.deleteTask(id);

		return new ResponseEntity<String>("book delete successfully", HttpStatus.OK);

	}

}
