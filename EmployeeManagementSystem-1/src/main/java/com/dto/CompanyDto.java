package com.dto;

import java.util.List;

import javax.validation.constraints.Pattern;

import com.entity.Employee;

import lombok.Builder;

public class CompanyDto {
private int id;
	
		private String name;
	
	private String address;
	
	@Pattern(regexp="\\d{6}")
	private String pincode;
	
	private List<Employee> employeeList;
	
	//@Builder
	/*public CompanyDto(int id, String name, String address,@Pattern(regexp = "\\d{6}")
	String pincode, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.employeeList = employeeList;
	
	
	


	}*/


	}
