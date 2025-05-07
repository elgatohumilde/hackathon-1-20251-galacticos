package com.example.hackathon_1.company.domain;

import com.example.hackathon_1.company.dto.CompanyDto;
import com.example.hackathon_1.company.dto.CreateCompanyDto;
import com.example.hackathon_1.company.infrastructure.CompanyRepository;
import com.example.hackathon_1.restriction.domain.Restriction;
import com.example.hackathon_1.restriction.infrastructure.RestrictionRepository;
import com.example.hackathon_1.user.domain.User;
import com.example.hackathon_1.user.infrastructure.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final RestrictionRepository restrictionRepository;
    private final UserRepository userRepository;
    public Restriction addRestriction(Long companyId, String modelType, Integer maxRequests) {
        Company company = companyRepository.findById(companyId).orElseThrow();

        Restriction restriction = new Restriction();
        restriction.setModelType(modelType);
        restriction.setMaxRequestsPerDay(maxRequests);
        restriction.setCompany(company);

        return restrictionRepository.save(restriction);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Transactional
    public Company createCompany(CreateCompanyDto dto) {
        // Validar que el RUC no exista
        if (companyRepository.existsByRuc(dto.getRuc())) {
            throw new IllegalArgumentException("El RUC ya está registrado");
        }

        // Obtener el admin (validar que exista)
        User admin = userRepository.findById(dto.getAdminId())
                .orElseThrow(() -> new IllegalArgumentException("Administrador no encontrado"));

        // Crear la empresa
        Company company = new Company();
        company.setNombre(dto.getNombre());
        company.setRUC(dto.getRuc());
        company.setAffiliationDate(LocalDate.now().toString()); // Fecha actual
        company.setState(State.ACTIVE); // Estado por defecto
        company.setAdmin(admin);

        return companyRepository.save(company);
    }

}

