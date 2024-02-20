package com.example.demo.service;

import com.example.demo.model.UserDto;
import com.example.demo.vo.ResponseVO;

public interface UserService {

	UserDto save(UserDto userDto);

	UserDto read(int id);

	ResponseVO getUserDepartment(int id);

}
