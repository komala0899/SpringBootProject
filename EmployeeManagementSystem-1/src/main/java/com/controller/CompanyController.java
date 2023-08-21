package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CompanyDto;
import com.entity.Company;
import com.service.CompanyService;
import com.util.CompanyConverter;
@RestController
public class CompanyController 
{
	@Autowired
	CompanyService companyService ;
	
	@Autowired
	CompanyConverter companyConverter;
	
	@PostMapping("/addCompanies")
	ResponseEntity<CompanyDto> addCompany(@RequestBody @Valid CompanyDto companyDTO)
	{ 
		
		Company company=companyConverter.convertToCompanyEntity(companyDTO);
		return new ResponseEntity<CompanyDto>(companyService.addCompany1(company),HttpStatus.CREATED);
	}
	
	@GetMapping("/getCompanyById/{id}")
	ResponseEntity<CompanyDto> getCompanyById(@PathVariable int id)
	{
		return new ResponseEntity<CompanyDto>(companyService.getCompanyById(id),HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllCompany")
	ResponseEntity<List<CompanyDto>> getCompanies()
	{
		return new ResponseEntity<List<CompanyDto>>(companyService.getAllCompanies(),HttpStatus.FOUND);
	}
	
	@PutMapping("/updateCompany/{id}")
	ResponseEntity<CompanyDto> updateCompany(@PathVariable int id,@RequestBody CompanyDto companyDTO)
	{
		Company company=companyConverter.convertToCompanyEntity(companyDTO);
		return new ResponseEntity<CompanyDto>(companyService.updateCompany1(id, company),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/deleteCompanyById/{id}")
	ResponseEntity<String> deleteCompanyById(@PathVariable int id)
	{
		return new ResponseEntity(companyService.deleteCompany(id),HttpStatus.OK);
	}
	
	
	
	
}