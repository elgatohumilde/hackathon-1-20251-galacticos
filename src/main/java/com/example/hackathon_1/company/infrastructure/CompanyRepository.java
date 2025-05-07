package com.example.hackathon_1.company.infrastructure;

import com.example.hackathon_1.company.domain.Company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
};
