package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.vo.ResponseVO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public UserDto save(@RequestBody UserDto userDto) {
			
			return service.save(userDto);
		}
	@GetMapping("/read/{id}")
	public UserDto read(@PathVariable("id") int id) {
			
			return service.read(id);
		}
	
	@GetMapping("/getUserDepartment/{id}")
	public ResponseVO getUserDepart(@PathVariable("id") int id) {
			
			return service.getUserDepartment(id);
		}
	
	
	
	}


