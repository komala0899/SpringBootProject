package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDto;
import com.entity.Employee;
import com.exception.ResourceNotFoundException;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService ;
	
	@PostMapping("/addEmployees")
	ResponseEntity<Employee> addEmployee(@RequestBody @Valid EmployeeDto employeeDTO)
	{
		try
		{
		Employee employee=( employeeService).addEmployee(employeeDTO);
		if(employee!=null)
		{
			return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
		}
		System.out.println("data inserted");

		}
	catch(Exception e)
	{
		throw new ResourceNotFoundException("Employee data is not entered properly,check it");
	}
	return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
	
	}
}
