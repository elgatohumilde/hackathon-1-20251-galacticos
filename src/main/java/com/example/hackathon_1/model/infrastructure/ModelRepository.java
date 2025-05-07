package com.example.hackathon_1.model.infrastructure;

import com.example.hackathon_1.model.domain.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
};
