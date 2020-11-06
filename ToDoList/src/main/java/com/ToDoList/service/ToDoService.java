package com.ToDoList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.ToDoList.dao.TaskRepo;
import com.ToDoList.model.Task;


public class ToDoService implements IToDoService
{
	@Autowired
	TaskRepo repo;
	
	public ModelAndView getTasks()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("task",repo.findAll());
		
		return mv;
	}

	public void addTasks(Task task)
	{
		repo.save(task);
	}

	
	public ModelAndView fetchTask(String task) 
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",repo.findByTask(task));
		
		return mv;
	}

	public void updateTask(Task task)
	{	
		repo.deleteById(task.getTask());
		
		repo.save(task);
	
	}

	public void deleteTasks(String task)
	{
		repo.deleteById(task);
		
	}
}
