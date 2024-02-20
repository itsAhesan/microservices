package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepo;
import com.example.demo.vo.Department;
import com.example.demo.vo.ResponseVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private RestTemplate template;

	@Override
	public UserDto save(UserDto userDto) {
		
		return repo.save(userDto);
		
	}

	@Override
	public UserDto read(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public ResponseVO getUserDepartment(int id) {
		ResponseVO vo= new ResponseVO();
		UserDto userDto = repo.findById(id).orElse(null);
		Department department = template.getForObject("http://DEPARTMENT/departments/read/"+userDto.getdId(), Department.class);
		vo.setUser(userDto);
		vo.setDepartment(department);
		
		return vo;
	}

}
