package com.example.hackathon_1.sparky.domain;

import com.example.hackathon_1.company.domain.Company;
import com.example.hackathon_1.company.infrastructure.CompanyRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SparkyService {
    private final CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }
};
