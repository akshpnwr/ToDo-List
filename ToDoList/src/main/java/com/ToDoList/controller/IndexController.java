package com.ToDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
  @RequestMapping("/")
  public String index()
  {
	  return "index";
  }
  
  @RequestMapping("/register")
  public String check()
  {
	  return "register";
  }
  
  @RequestMapping("/home")
  public String home()
  {
	  return "home";
  }
}
