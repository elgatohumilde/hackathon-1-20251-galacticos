package com.example.hackathon_1.restriction.infrastructure;

import com.example.hackathon_1.restriction.domain.Restriction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestrictionRepository extends JpaRepository<Restriction, Long> {
};
