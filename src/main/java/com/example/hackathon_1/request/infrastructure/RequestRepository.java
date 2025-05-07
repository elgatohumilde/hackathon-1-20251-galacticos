package com.example.hackathon_1.request.infrastructure;

import com.example.hackathon_1.request.domain.Request;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
};
