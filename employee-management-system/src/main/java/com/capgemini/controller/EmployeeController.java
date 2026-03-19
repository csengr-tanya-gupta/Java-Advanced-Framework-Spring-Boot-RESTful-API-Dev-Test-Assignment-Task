package com.capgemini.controller;

import com.capgemini.model.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.service.EmployeeService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/saveEmployee")
	public void postEmployee(@RequestBody Employee employee) {
		//TODO: process POST request
		
		employeeService.saveEmployee(employee);
	}
	
	@PostMapping("/saveEmployeeAll")
	public void postEmployees(@RequestBody List<Employee> employees) {
		//TODO: process POST request
		employeeService.saveEmployees(employees);
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getemployee(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	
	

}
