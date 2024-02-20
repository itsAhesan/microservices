package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo repo;

	@Override
	public Department save(Department department) {
		
		return repo.save(department);
	}

	@Override
	public Department read(int id) {
		
		return repo.findById(id).orElse(null);
	}

}
