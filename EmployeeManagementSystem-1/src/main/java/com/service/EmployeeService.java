package com.service;


import javax.validation.Valid;

import com.dto.EmployeeDto;
import com.entity.Employee;

public interface EmployeeService {
	Employee assignCompanyToEmployee(int empId,int companyId);

	Employee addEmployee(@Valid EmployeeDto employeeDto);

}
