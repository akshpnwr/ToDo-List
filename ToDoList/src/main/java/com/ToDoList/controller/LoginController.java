package com.ToDoList.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ToDoList.dao.UserRepo;

@Controller
public class LoginController
{
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		session.invalidate();
		
		return "login";
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("username") String username,@RequestParam("password") String password,HttpServletRequest request)
	{
		if(repo.existsByUsername(username) && repo.existsByPassword(password))
			{
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				return "home";
			}
		
		return "login";
	}

}
