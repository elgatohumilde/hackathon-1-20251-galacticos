package com.example.hackathon_1.company.application;

import com.example.hackathon_1.company.domain.Company;
import com.example.hackathon_1.company.domain.CompanyService;
import com.example.hackathon_1.company.dto.CreateCompanyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin/companies")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody CreateCompanyRequest request){

    }
};
