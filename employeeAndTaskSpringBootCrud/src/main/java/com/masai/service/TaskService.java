package com.masai.service;

import java.util.List;

import com.masai.model.Task;

public interface TaskService {

	public Task createTask(Task task);

	public Task getTaskById(Integer id);

	public List<Task> getAllTask();

	public Task updateTask(Integer id);

	public String deleteTask(Integer id);

}
