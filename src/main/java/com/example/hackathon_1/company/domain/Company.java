package com.example.hackathon_1.company.domain;

import java.util.List;

import com.example.hackathon_1.restriction.domain.Restriction;
import com.example.hackathon_1.user.domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String RUC;

    private String affiliationDate;

    @Enumerated(EnumType.ORDINAL)
    private State state;

    private User admin;

    @OneToMany
    private List<User> users;

    @OneToMany
    private List<Restriction> restrictions;
};
