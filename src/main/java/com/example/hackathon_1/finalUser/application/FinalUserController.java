package com.example.hackathon_1.finalUser.application;

import com.example.hackathon_1.finalUser.domain.FinalUserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/ia")
@RequiredArgsConstructor
public class FinalUserController {
    private final FinalUserService finalUserService;
};
