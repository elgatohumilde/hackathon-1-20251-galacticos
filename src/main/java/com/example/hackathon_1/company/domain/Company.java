package com.example.hackathon_1.company.domain;

import java.util.List;

import com.example.hackathon_1.restriction.domain.Restriction;
import com.example.hackathon_1.user.domain.User;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false, unique = true)
    private String RUC;

    @Column(name="affiliation_date",nullable=false)
    private String affiliationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private State state = State.ACTIVE;
    // valor por defecto de una empresa

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    private User admin;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Restriction> restrictions;
};
