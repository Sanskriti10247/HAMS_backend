package com.hospital.hams.dto;

import lombok.Data;

@Data
public class PatientDTO {
    private Long id;
    private String name;
    private String gender;
    private int age;
    private String contactNumber;
    private String medicalHistory;
    private Long userId;
}
