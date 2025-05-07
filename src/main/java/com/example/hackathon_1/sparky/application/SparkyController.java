package com.example.hackathon_1.sparky.application;

import com.example.hackathon_1.company.domain.Company;
import com.example.hackathon_1.sparky.domain.SparkyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin/companies")
@RequiredArgsConstructor
public class SparkyController {
    private final SparkyService sparkyService;

    @PostMapping
    public Company createCompany(Company company) {
        return sparkyService.createCompany(company);
    }
};
