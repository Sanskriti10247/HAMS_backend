package com.hospital.hams.service;

import com.hospital.hams.dto.AppointmentDTO;
import java.util.List;

public interface AppointmentService {
    AppointmentDTO bookAppointment(AppointmentDTO dto);
    List<AppointmentDTO> getAppointmentsByDoctor(Long doctorId);
    List<AppointmentDTO> getAppointmentsByPatient(Long patientId);
    AppointmentDTO updateAppointment(Long id, AppointmentDTO dto);
    void cancelAppointment(Long id);
}
