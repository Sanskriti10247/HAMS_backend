package com.hospital.hams.repository;

import com.hospital.hams.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecializationContainingIgnoreCase(String specialization);

}
