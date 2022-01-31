package com.ds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.entity.Department;
import com.ds.service.DepartmentService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ds")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class DeparmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping
	public ResponseEntity<Department> saveDept(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
		return new ResponseEntity<Department>(service.saveDepartment(department),HttpStatus.OK);
	}
	

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return service.findDepartmentById(departmentId);
    }

	
}
