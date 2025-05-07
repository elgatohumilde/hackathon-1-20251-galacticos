package com.example.hackathon_1.company.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/company/restrictions")
@RequiredArgsConstructor
public class CompanyController {
    @GetMapping
};
