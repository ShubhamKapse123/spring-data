package com.springapp.springdata.onetoone.entities;

import jakarta.persistence.*;


@Entity
@Table(name="laptop_table")
public class Laptop {
   @Id
   @GeneratedValue(strategy =GenerationType.UUID)
   private String deviceId;
   private String deviceName;

   @OneToOne
   @JoinColumn(name = "student_id")
   private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
