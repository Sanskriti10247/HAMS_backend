package com.hospital.hams.controller;

import com.hospital.hams.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestMailController {

    private final EmailService emailService;

    @GetMapping("/mail/test")
    public Map<String, Object> sendTestMail(@RequestParam String to) {
        emailService.sendEmail(
                to,
                "Test Email from HAMS",
                "✅ This is a test email from your Hospital Appointment Management System backend!"
        );

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Email sent successfully to " + to);
        response.put("timestamp", LocalDateTime.now());
        return response;
    }
}
