package com.hospital.hams.repository;

import com.hospital.hams.model.Appointment;
import com.hospital.hams.model.Doctor;
import com.hospital.hams.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByDoctor(Doctor doctor);

    List<Appointment> findByPatient(Patient patient);

    List<Appointment> findByAppointmentDateBetween(LocalDateTime start, LocalDateTime end);
}
