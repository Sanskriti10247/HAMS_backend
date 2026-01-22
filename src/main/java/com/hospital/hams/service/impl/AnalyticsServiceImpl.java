package com.hospital.hams.service.impl;

import com.hospital.hams.repository.AppointmentRepository;
import com.hospital.hams.service.AnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AnalyticsServiceImpl implements AnalyticsService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public Map<String, Long> getAppointmentStatistics() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("totalAppointments", appointmentRepository.count());
        return stats;
    }
}
