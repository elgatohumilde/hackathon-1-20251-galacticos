package com.example.hackathon_1.company.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateCompanyDto{
    @NotBlank
    private String nombre;

    @NotBlank
    @Size(min=11, max = 11)
    private Long ruc;

    @NotNull
    private Long adminId;
}
