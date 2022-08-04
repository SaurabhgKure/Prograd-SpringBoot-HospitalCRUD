package com.Hospital.hospitalManagement.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="PatientDetails")
public class PatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cause;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private int contactNo;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String roomNo;
}
