package com.hospital.hams.service;

import com.hospital.hams.dto.DoctorDTO;
import java.util.List;

public interface DoctorService {

    DoctorDTO createDoctor(DoctorDTO doctorDTO);

    List<DoctorDTO> getAllDoctors();

    DoctorDTO getDoctorById(Long id);

    String deleteDoctor(Long id);
}
