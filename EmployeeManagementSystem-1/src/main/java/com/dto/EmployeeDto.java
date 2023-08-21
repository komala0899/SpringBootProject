package com.dto;

import javax.validation.constraints.Email;

import com.entity.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	private int id;
		private String name;
	@Email(message="recheck the entered email id")
	private String email;
	Company company;
}
