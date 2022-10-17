package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
