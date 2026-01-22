package com.hospital.hams.service;

import java.util.Map;

public interface AnalyticsService {
    Map<String, Long> getAppointmentStatistics();
}
