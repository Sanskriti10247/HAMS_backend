package com.hospital.hams.service.impl;

import com.hospital.hams.dto.DoctorDTO;
import com.hospital.hams.model.Doctor;
import com.hospital.hams.model.User;
import com.hospital.hams.repository.DoctorRepository;
import com.hospital.hams.repository.UserRepository;
import com.hospital.hams.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final UserRepository userRepository;

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {

        User user = userRepository.findById(doctorDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Doctor doctor = new Doctor();
        doctor.setName(doctorDTO.getName());
        doctor.setSpecialization(doctorDTO.getSpecialization());
        doctor.setContactNumber(doctorDTO.getContactNumber());
        doctor.setAvailability(doctorDTO.getAvailability());
        doctor.setUser(user);

        Doctor saved = doctorRepository.save(doctor);

        return new DoctorDTO(
                saved.getId(),
                saved.getName(),
                saved.getSpecialization(),
                saved.getContactNumber(),
                saved.getAvailability(),
                saved.getUser().getId()
        );
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return doctorRepository.findAll()
                .stream()
                .map(d -> new DoctorDTO(
                        d.getId(),
                        d.getName(),
                        d.getSpecialization(),
                        d.getContactNumber(),
                        d.getAvailability(),
                        d.getUser().getId()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        Doctor d = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        return new DoctorDTO(
                d.getId(),
                d.getName(),
                d.getSpecialization(),
                d.getContactNumber(),
                d.getAvailability(),
                d.getUser().getId()
        );
    }

    @Override
    public String deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
        return "Doctor deleted successfully";
    }
}
