package com.example.hackathon_1.finalUser.domain;

import com.example.hackathon_1.finalUser.infrastructure.FinalUserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FinalUserService {
    private final FinalUserRepository finalUserRepository;
};
