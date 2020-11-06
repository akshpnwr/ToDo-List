package com.ToDoList.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task 
{
	@Id
	private String task;
	private String status;
	private Date date;
	
	
	
	public Task() {
		super();
		this.status = "incomplete";
	}
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Task [task=" + task + ", status=" + status + ", date=" + date + "]";
	}
	
	
}
