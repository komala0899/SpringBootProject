package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

}