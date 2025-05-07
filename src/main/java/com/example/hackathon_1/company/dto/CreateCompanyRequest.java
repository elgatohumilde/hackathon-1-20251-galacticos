package com.example.hackathon_1.company.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateCompanyRequest {
    @NotBlank(message = "Name is required")
    private String nombre;

    @NotBlank
    @Size(min=11, max=11, message="RUC must be 11 digits long")
    private String ruc;

    @NotNull(message = "Admin id is required")
    private Long adminId;


}
