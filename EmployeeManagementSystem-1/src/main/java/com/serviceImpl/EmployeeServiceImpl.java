package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Company;
import com.entity.Employee;
import com.repository.CompanyRepository;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

public abstract class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository ;
	
	@Autowired
	CompanyRepository companyRepository;

	
	@Override
	public Employee assignCompanyToEmployee(int empId, int companyId) {
		Employee employee=employeeRepository.findById(empId).get();
		Company company=companyRepository.findById(companyId).get();
		 employee.setCompany(employee.getCompany());

		return employeeRepository.save(employee);
	
	}


}
