package com.Hospital.hospitalManagement.Repository;

import com.Hospital.hospitalManagement.Model.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDetailRepo extends JpaRepository<PatientDetails,Integer> {
}
