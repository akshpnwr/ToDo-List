package com.ToDoList.dao;

import org.springframework.data.repository.CrudRepository;

import com.ToDoList.model.User;

public interface UserRepo extends CrudRepository<User,Integer>
{
	public boolean existsByUsername(String username);
	
	public boolean existsByPassword(String password);
}
