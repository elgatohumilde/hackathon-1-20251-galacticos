package com.example.hackathon_1.finalUser.domain;

import java.util.ArrayList;
import java.util.List;

import com.example.hackathon_1.request.domain.Request;
import com.example.hackathon_1.user.domain.Role;
import com.example.hackathon_1.user.domain.User;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FinalUser extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<Request> historial = new ArrayList<>();

    @Column(nullable = false)
    private Role role = Role.ROLE_USER;
};
