package com.hospital.hams.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String contactNumber;
    private String availability; // e.g. MON-FRI 9AM–5PM

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
