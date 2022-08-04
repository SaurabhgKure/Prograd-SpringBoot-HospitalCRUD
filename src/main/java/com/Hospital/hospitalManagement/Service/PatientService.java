package com.Hospital.hospitalManagement.Service;

import com.Hospital.hospitalManagement.Model.PatientDetails;

import java.util.List;

public interface PatientService {
    PatientDetails saveDetail(PatientDetails pd);

    List<PatientDetails> getAllDetail();
    PatientDetails getDetailById(int id);
    PatientDetails updateDetail(PatientDetails pd,int id);
    void deleteDetail(int id);
}
