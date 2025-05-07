package com.example.hackathon_1.admin.infrastructure;

import com.example.hackathon_1.admin.domain.Admin;
import com.example.hackathon_1.user.infrastructure.UserRepository;

public interface AdminRepository extends UserRepository<Admin> {
};
