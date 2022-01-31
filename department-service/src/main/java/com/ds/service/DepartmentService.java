package com.ds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ds.entity.Department;
import com.ds.repo.DepartmentRepo;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class DepartmentService {

	@Autowired
	DepartmentRepo repo;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return repo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside saveDepartment of DepartmentService");
		return repo.findByDepId(departmentId);
	}

}
