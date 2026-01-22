package com.hospital.hams.controller;

import com.hospital.hams.dto.DoctorDTO;
import com.hospital.hams.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping
    public DoctorDTO createDoctor(@RequestBody DoctorDTO doctorDTO) {
        return doctorService.createDoctor(doctorDTO);
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public DoctorDTO getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        return doctorService.deleteDoctor(id);
    }
}
