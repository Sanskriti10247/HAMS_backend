package com.hospital.hams.controller;

import com.hospital.hams.service.AnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/api/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    @GetMapping("/summary")
    public ResponseEntity<Map<String, Long>> getAppointmentStatistics() {
        return ResponseEntity.ok(analyticsService.getAppointmentStatistics());
    }
}
