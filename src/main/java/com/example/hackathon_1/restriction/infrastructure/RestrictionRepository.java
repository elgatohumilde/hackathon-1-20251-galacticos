package com.example.hackathon_1.restriction.infrastructure;

import com.example.hackathon_1.restriction.domain.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestrictionRepository extends JpaRepository<Restriction, Long> {
    List<Restriction> findByCompanyId(Long id);
}
