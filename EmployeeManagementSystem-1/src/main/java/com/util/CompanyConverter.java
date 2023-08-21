package com.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dto.CompanyDto;
import com.entity.Company;


@Component
public class CompanyConverter {
	//converting DTO to entity
	public Company convertToCompanyEntity(CompanyDto companyDto)
	{
		Company company=new Company();
		if(companyDto!=null)
		{
			BeanUtils.copyProperties(companyDto,company );
		}
		return company;
		
	}
	//converting  entity to DTO
	public CompanyDto convertToCompanyDTO(Company company)
	{
		CompanyDto companyDto=new CompanyDto();
		if(company!=null)
		{
			BeanUtils.copyProperties(company,companyDto );
		}
		return companyDto;
		
	}
	
	

}