package com.ToDoList.dao;


import org.springframework.data.repository.CrudRepository;

import com.ToDoList.model.Task;

public interface TaskRepo extends CrudRepository<Task, String> 
{
	public boolean existsByTask(String task);
	Task findByTask(String task);
	
	
}
