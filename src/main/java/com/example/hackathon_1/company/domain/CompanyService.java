package com.example.hackathon_1.company.domain;

import com.example.hackathon_1.company.dto.CompanyDto;
import com.example.hackathon_1.company.dto.CreateCompanyDto;
import com.example.hackathon_1.company.infrastructure.CompanyRepository;
import com.example.hackathon_1.user.domain.User;
import com.example.hackathon_1.user.infrastructure.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public CompanyDto createCompany(CreateCompanyDto dto) {
        User admin = userRepository.findById(dto.getAdminId())
                .orElseThrow(() -> new UserNotFoundException(dto.getAdminId()));

        Company company = new Company();
        company.setNombre(dto.getNombre());
        company.setRuc(dto.getRuc());
        company.setAffiliationDate(LocalDate.now());
        company.setState(State.ACTIVE);
        company.setAdmin(admin);

        company = companyRepository.save(company);
        return modelMapper.map(company, CompanyDTO.class);
    }

    public List<CompanyDto> getAllCompanies() {
        return companyRepository.findAll()
                .stream()
                .map(company -> modelMapper.map(company, CompanyDTO.class))
                .toList();
    }

    public CompanyDto getCompanyById(Long id) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));
        return modelMapper.map(company, CompanyDTO.class);
    }

    @Transactional
    public CompanyDTO updateCompany(Long id, CompanyDTO dto) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));

        company.setNombre(dto.getNombre());
        company.setRuc(dto.getRuc());
        company.setAffiliationDate(dto.getAffiliationDate());

        return modelMapper.map(companyRepository.save(company), CompanyDTO.class);
    }

    @Transactional
    public CompanyDTO updateCompanyStatus(Long id, CompanyStatusDTO dto) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));

        company.setState(dto.getState());
        return modelMapper.map(companyRepository.save(company), CompanyDTO.class);
    }

    public List<CompanyConsumptionDTO> getCompanyConsumption(Long companyId) {
        // Implementación de lógica para obtener consumo
        // Esto puede requerir una consulta personalizada en el repositorio
        return consumptionRepository.findByCompanyId(companyId)
                .stream()
                .map(this::convertToConsumptionDTO)
                .toList();
    }
}