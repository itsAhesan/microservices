package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Department;


public interface DepartmentService {

	Department save(Department department);

	Department read(int id);

}
