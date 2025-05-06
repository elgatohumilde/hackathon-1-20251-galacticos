package com.example.hackathon_1.finalUser.domain;

import java.util.List;

import com.example.hackathon_1.request.domain.Request;
import com.example.hackathon_1.user.domain.User;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "users")
@RequiredArgsConstructor
public class FinalUser extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Request> historial;
};
