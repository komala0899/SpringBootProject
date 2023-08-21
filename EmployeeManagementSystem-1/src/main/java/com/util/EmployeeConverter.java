package com.util;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dto.EmployeeDto;
import com.entity.Employee;


@Component
public class EmployeeConverter {
	//converting DTO to entity
	Employee convertToEmployeeEntity(EmployeeDto employeeDTO)
	{
		Employee employee=new Employee();
		if(employeeDTO!=null)
		{
			BeanUtils.copyProperties(employeeDTO, employee);
		}
		return employee;
		
	}
	//converting  entity to DTO
	EmployeeDto convertToEmployeeDTO(Employee employee)
	{
		EmployeeDto employeeDTO=new EmployeeDto();
		if(employee!=null)
		{
			BeanUtils.copyProperties(employee, employeeDTO);
		}
		return employeeDTO;
		
	

}
}