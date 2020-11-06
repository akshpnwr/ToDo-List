package com.ToDoList.service;



import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.ToDoList.model.Task;

@Component
public interface IToDoService
{
	public ModelAndView getTasks();
	public void addTasks(Task task);
	public ModelAndView fetchTask(String task);
	public void updateTask(Task task);
	public void deleteTasks(String task);
}
