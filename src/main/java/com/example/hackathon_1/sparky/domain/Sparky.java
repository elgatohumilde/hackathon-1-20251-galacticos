package com.example.hackathon_1.restriction.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Sparky {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
};
