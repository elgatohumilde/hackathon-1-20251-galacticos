package com.example.hackathon_1.company.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.hackathon_1.company.domain.Company;
import com.example.hackathon_1.company.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByRuc(String ruc);
    List<Company> findByState(State state);
    List<Company> findByNombreContainingIgnoreCase(String nombre);

    // verificar si la compañia existe
    boolean existsByRuc(String ruc);

    // verificar por fecha de afiliacion
    List<Company> findByFechaAfiliacionDateBetween(String fechaInicio, String fechaFin);

    @Query("SELECT c.state, COUNT(c) FROM Company c GROUP BY c.state")
    List<Object[]> countCompaniesByState();

}
