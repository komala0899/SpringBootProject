package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.CompanyDto;
import com.entity.Company;
import com.repository.CompanyRepository;
import com.service.CompanyService;
import com.util.CompanyConverter;
@Service
public abstract class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	CompanyConverter companyConverter;
   @Override
	public CompanyDto addCompany1(Company company) {
		Company comp=companyRepository.save(company);
		return companyConverter.convertToCompanyDTO(comp);
	}
	@Override
	public List<CompanyDto> getAllCompanies() {
		List<Company> companies=companyRepository.findAll();
		
		//list of DTO type
		List<CompanyDto> dtoList=new ArrayList<>();
		for(Company c:companies)
		{
			dtoList.add(companyConverter.convertToCompanyDTO(c));
		}
		return dtoList;
		}
	@Override
	public CompanyDto getCompanyById(int id) {
		Company company=companyRepository.findById(id).get();
		return companyConverter.convertToCompanyDTO(company);
	}
	
	public CompanyDto updateCompany(int id, Company company) {
		Company c=companyRepository.findById(id).get();
		c.setName(company.getName());
		c.setAddress(company.getAddress());
		c.setPincode(company.getPincode());
		Company comp=companyRepository.save(c);
		return companyConverter.convertToCompanyDTO(comp);
	}
	@Override
	public String deleteCompany(int id) {
		companyRepository.deleteById(id);
		
		return "Company details got deleted successfuly";
	}
		
}