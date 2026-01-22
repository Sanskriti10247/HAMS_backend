package com.hospital.hams.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gender;
    private int age;
    private String contactNumber;

    @Column(length = 500)
    private String medicalHistory;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
