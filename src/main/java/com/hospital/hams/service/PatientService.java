package com.hospital.hams.service;

import com.hospital.hams.dto.PatientDTO;
import java.util.List;

public interface PatientService {
    PatientDTO createPatient(PatientDTO dto);
    List<PatientDTO> getAllPatients();
    PatientDTO getPatientById(Long id);
    void deletePatient(Long id);
}
