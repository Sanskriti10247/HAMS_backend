package com.hospital.hams.service.impl;

import com.hospital.hams.dto.PatientDTO;
import com.hospital.hams.model.Patient;
import com.hospital.hams.repository.PatientRepository;
import com.hospital.hams.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    public PatientDTO createPatient(PatientDTO dto) {
        Patient p = Patient.builder()
                .name(dto.getName())
                .gender(dto.getGender())
                .age(dto.getAge())
                .contactNumber(dto.getContactNumber())
                .medicalHistory(dto.getMedicalHistory())
                .build();
        patientRepository.save(p);
        dto.setId(p.getId());
        return dto;
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(p -> {
                    PatientDTO dto = new PatientDTO();
                    dto.setId(p.getId());
                    dto.setName(p.getName());
                    dto.setGender(p.getGender());
                    dto.setAge(p.getAge());
                    dto.setContactNumber(p.getContactNumber());
                    dto.setMedicalHistory(p.getMedicalHistory());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        Patient p = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        PatientDTO dto = new PatientDTO();
        dto.setId(p.getId());
        dto.setName(p.getName());
        dto.setGender(p.getGender());
        dto.setAge(p.getAge());
        dto.setContactNumber(p.getContactNumber());
        dto.setMedicalHistory(p.getMedicalHistory());
        return dto;
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
