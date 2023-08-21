package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.dto.CompanyDto;
import com.entity.Company;

public interface CompanyService {
	CompanyDto addCompany1(Company company);
	List<CompanyDto> getAllCompanies();
	CompanyDto getCompanyById(int id);
	CompanyDto updateCompany11(int id,Company company);
	String deleteCompany(int id);
	CompanyDto updateCompany1(int id, Company company);
	

}