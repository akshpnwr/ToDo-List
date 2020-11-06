package com.ToDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ToDoList.model.Task;
import com.ToDoList.service.IToDoService;

@Controller
public class HomeController
{	
	@Autowired
	IToDoService service;
	
	@RequestMapping("/view")
	public ModelAndView view()
	{	
		ModelAndView mv=service.getTasks();
		mv.setViewName("view");
		
		return mv;
		
	}
	
	@RequestMapping("/add")
	public String add()
	{	
		return "addTask";
	}
	
	@RequestMapping("/addTask")
	public String addTask(Task task)
	{
		service.addTasks(task);
		
		return "home";
	}
	
	@RequestMapping("/update")
	public ModelAndView update()
	{
		ModelAndView mv=service.getTasks();
		mv.setViewName("update");
		
		return mv;
	}
	
	@RequestMapping("/fetchTask")
	public ModelAndView fetchTask(@RequestParam("task") String task)
	{
		ModelAndView mv=service.fetchTask(task);
		mv.setViewName("update1");
		
		return mv;
	}
	
	@RequestMapping("/updateTask")
	public String updateTask(Task task)
	{
		service.updateTask(task);
		return "home";
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		ModelAndView mv=service.getTasks();
		mv.setViewName("delete");
		return mv;
	}
	
	@RequestMapping("/deleteTask")
	public String deleteTask(@RequestParam("task") String task)
	{
		service.deleteTasks(task);
		
		return "home";
	}
}
