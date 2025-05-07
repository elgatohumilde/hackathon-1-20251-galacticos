package com.example.hackathon_1.company.dto;

import com.example.hackathon_1.company.domain.State;
import lombok.Data;

@Data
public class CompanyDto {
    private Long id;
    private String nombre;
    private String ruc;
    private String affiliationDate;
    private State state;
    private Long adminId;
}




