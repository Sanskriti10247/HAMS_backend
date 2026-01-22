package com.hospital.hams.util;

import org.springframework.stereotype.Component;

/**
 * Utility to generate HTML email templates for various hospital notifications.
 */
@Component
public class EmailTemplateBuilder {

    public String buildAppointmentConfirmationEmail(String doctorName, String patientName, String dateTime) {
        return "<html>" +
                "<body style='font-family:Arial, sans-serif; line-height:1.6;'>" +
                "<h2 style='color:#2E86C1;'>Appointment Confirmed</h2>" +
                "<p>Dear <strong>" + patientName + "</strong>,</p>" +
                "<p>Your appointment with <strong>Dr. " + doctorName + "</strong> has been successfully booked.</p>" +
                "<p><strong>Date & Time:</strong> " + dateTime + "</p>" +
                "<p>We look forward to seeing you then.</p>" +
                "<br/><p>Warm regards,<br/>Hospital Appointment Team</p>" +
                "<hr/><p style='font-size:12px;color:#888;'>This is an automated message. Please do not reply.</p>" +
                "</body>" +
                "</html>";
    }

    public String buildAppointmentCancellationEmail(String doctorName, String patientName, String dateTime) {
        return "<html>" +
                "<body style='font-family:Arial, sans-serif; line-height:1.6;'>" +
                "<h2 style='color:#C0392B;'>Appointment Cancelled</h2>" +
                "<p>Dear <strong>" + patientName + "</strong>,</p>" +
                "<p>Your appointment with <strong>Dr. " + doctorName + "</strong> scheduled for " + dateTime + " has been cancelled.</p>" +
                "<p>If you wish to reschedule, please log in to your account and book a new appointment.</p>" +
                "<br/><p>Best regards,<br/>Hospital Appointment Team</p>" +
                "<hr/><p style='font-size:12px;color:#888;'>This is an automated message. Please do not reply.</p>" +
                "</body>" +
                "</html>";
    }

    public String buildGenericEmail(String subject, String message) {
        return "<html>" +
                "<body style='font-family:Arial, sans-serif; line-height:1.6;'>" +
                "<h2 style='color:#34495E;'>" + subject + "</h2>" +
                "<p>" + message + "</p>" +
                "<br/><p>Thank you,<br/>Hospital Appointment System</p>" +
                "</body></html>";
    }
}
