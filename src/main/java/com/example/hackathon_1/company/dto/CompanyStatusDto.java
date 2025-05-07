package com.example.hackathon_1.company.dto;

import com.example.hackathon_1.company.domain.State;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CompanyStatusDto{
    @NotNull
    private State state;
}