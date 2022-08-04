package com.Hospital.hospitalManagement.Service;
import org.springframework.stereotype.Service;
import com.Hospital.hospitalManagement.Model.PatientDetails;
import com.Hospital.hospitalManagement.Repository.PatientDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class PatientServiceIMPL implements PatientService{
    @Autowired
    private PatientDetailRepo pdrepo;

    public PatientServiceIMPL(PatientDetailRepo pdrepo) {
        this.pdrepo =pdrepo;
    }

    @Override
    public PatientDetails saveDetail(PatientDetails pd) {
        return pdrepo.save(pd);
    }

    @Override
    public List<PatientDetails> getAllDetail() {
        return pdrepo.findAll();
    }

    @Override
    public PatientDetails getDetailById(int id) {
        return pdrepo.findById(id).orElseThrow();
    }

    @Override
    public PatientDetails updateDetail(PatientDetails pd, int id) {
        PatientDetails existingDetail=pdrepo.findById(id).orElseThrow();
        existingDetail.setName(pd.getName());
        existingDetail.setContactNo(pd.getContactNo());
        existingDetail.setCause(pd.getCause());
        existingDetail.setAddress(pd.getAddress());
        existingDetail.setRoomNo(pd.getRoomNo());
        existingDetail.setDate(pd.getDate());
        existingDetail.setAge(pd.getAge());
        pdrepo.save(existingDetail);
        return existingDetail;
    }

    @Override
    public void deleteDetail(int id) {
        pdrepo.findById(id).orElseThrow();
        pdrepo.deleteById(id);

    }
}
