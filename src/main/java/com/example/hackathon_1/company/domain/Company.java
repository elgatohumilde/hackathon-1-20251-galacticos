package com.example.hackathon_1.company.domain;

import java.util.List;

import com.example.hackathon_1.restriction.domain.Restriction;
import com.example.hackathon_1.user.domain.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String RUC;

    @Column(nullable = false)
    private String affiliationDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private State state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private User admin;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<User> users;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<Restriction> restrictions;
};
