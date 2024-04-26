package com.springapp.springdata.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "st")
public class Student {
    @Column(name = "stid")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stdId;
    @Column(name = "stname")
    private String stdName;

    public Student( String stdName) {
        this.stdName = stdName;
    }

    public Student() {
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdName() {
        return stdName;
    }

    public int getStdId() {
        return stdId;
    }
}
