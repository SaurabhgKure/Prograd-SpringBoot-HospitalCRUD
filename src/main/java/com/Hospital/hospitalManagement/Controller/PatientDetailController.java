package com.Hospital.hospitalManagement.Controller;

import com.Hospital.hospitalManagement.Model.PatientDetails;
import com.Hospital.hospitalManagement.Service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class PatientDetailController {
    @Autowired
    private PatientService service;

    public PatientDetailController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PatientDetails> saveBook(@RequestBody PatientDetails pd)
    {
        return new ResponseEntity<PatientDetails>(service.saveDetail(pd), HttpStatus.CREATED);
    }

    @GetMapping
    public List<PatientDetails> getAllDetail()
    {
        return service.getAllDetail();
    }
    @GetMapping("{id}")
    public ResponseEntity<PatientDetails> getDetailById(@PathVariable("id")int id)
    {
        return new ResponseEntity<PatientDetails>(service.getDetailById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<PatientDetails> updateDetail(@PathVariable("id")int id,@RequestBody PatientDetails pd)
    {
        return new ResponseEntity<PatientDetails>(service.updateDetail(pd,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDetail(@PathVariable("id")int id)
    {
        service.deleteDetail(id);
        return new ResponseEntity<String>("Detail deleted successfully",HttpStatus.OK);
    }
}
