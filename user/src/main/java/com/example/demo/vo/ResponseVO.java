package com.example.demo.vo;

import com.example.demo.model.UserDto;

public class ResponseVO {
	
	private UserDto user;
	private Department department;
	
	
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
