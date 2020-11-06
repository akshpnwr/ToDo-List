package com.ToDoList.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ToDoList.service.IToDoService;
import com.ToDoList.service.ToDoService;

@Configuration
public class ToDoConfig {

	@Bean
	public IToDoService iToDoService()
	{
		return new ToDoService();
	}
}
