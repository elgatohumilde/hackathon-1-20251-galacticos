package com.example.hackathon_1.restriction.domain;

import com.example.hackathon_1.company.domain.Company;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data
@RequiredArgsConstructor
public class Restriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelType;
    private Integer maxRequestsPerDay;
    private Integer usedRequests = 0;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
};
