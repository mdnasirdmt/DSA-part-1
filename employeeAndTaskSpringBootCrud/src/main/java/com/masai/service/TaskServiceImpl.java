package com.masai.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeNotFoundException;
import com.masai.model.Task;
import com.masai.repository.TaskRepository;


@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task createTask(Task task) {

		return taskRepository.save(task);
	}

	@Override
	public Task getTaskById(Integer id) {

		return taskRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("emp not found by this id to show " + id));

	}

	@Override
	public List<Task> getAllTask() {

		return taskRepository.findAll();
	}

	@Override
	public Task updateTask(Integer id) {

		Task exsit = taskRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("emp not found to update please enter again !"));
		exsit.setTitle(exsit.getTitle());

		taskRepository.save(exsit);

		return exsit;
	}

	@Override
	public String deleteTask(Integer id) {

		taskRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("task not found to delete !"));

		taskRepository.deleteById(id);

		return "task deleted successfully !";
	}

}
