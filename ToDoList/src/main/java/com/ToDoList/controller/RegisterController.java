package com.ToDoList.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ToDoList.dao.UserRepo;
import com.ToDoList.model.User;

@Controller
public class RegisterController
{

	@Autowired
	UserRepo repo;
	
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		repo.save(user);
		
		return "index";
	}
}
