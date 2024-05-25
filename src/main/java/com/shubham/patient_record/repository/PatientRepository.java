package com.shubham.patient_record.repository;

import com.shubham.patient_record.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
