package com.example.hackathon_1.user.infrastructure;

import com.example.hackathon_1.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T extends User> extends JpaRepository<T, Long> {
}
