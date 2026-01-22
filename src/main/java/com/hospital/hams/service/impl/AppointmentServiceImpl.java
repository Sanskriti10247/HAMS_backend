package com.hospital.hams.service.impl;

import com.hospital.hams.dto.AppointmentDTO;
import com.hospital.hams.model.*;
import com.hospital.hams.repository.*;
import com.hospital.hams.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Override
    public AppointmentDTO bookAppointment(AppointmentDTO dto) {
        Doctor doctor = doctorRepository.findById(dto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
        Patient patient = patientRepository.findById(dto.getPatientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Appointment appt = Appointment.builder()
                .doctor(doctor)
                .patient(patient)
                .appointmentDate(dto.getAppointmentDate())
                .status("BOOKED")
                .build();

        appointmentRepository.save(appt);
        dto.setId(appt.getId());
        dto.setStatus(appt.getStatus());
        return dto;
    }

    @Override
    public List<AppointmentDTO> getAppointmentsByDoctor(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
        return appointmentRepository.findByDoctor(doctor)
                .stream()
                .map(a -> {
                    AppointmentDTO dto = new AppointmentDTO();
                    dto.setId(a.getId());
                    dto.setDoctorId(a.getDoctor().getId());
                    dto.setPatientId(a.getPatient().getId());
                    dto.setAppointmentDate(a.getAppointmentDate());
                    dto.setStatus(a.getStatus());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public List<AppointmentDTO> getAppointmentsByPatient(Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return appointmentRepository.findByPatient(patient)
                .stream()
                .map(a -> {
                    AppointmentDTO dto = new AppointmentDTO();
                    dto.setId(a.getId());
                    dto.setDoctorId(a.getDoctor().getId());
                    dto.setPatientId(a.getPatient().getId());
                    dto.setAppointmentDate(a.getAppointmentDate());
                    dto.setStatus(a.getStatus());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public AppointmentDTO updateAppointment(Long id, AppointmentDTO dto) {
        Appointment a = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
        a.setStatus(dto.getStatus());
        appointmentRepository.save(a);
        dto.setId(a.getId());
        return dto;
    }

    @Override
    public void cancelAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}
