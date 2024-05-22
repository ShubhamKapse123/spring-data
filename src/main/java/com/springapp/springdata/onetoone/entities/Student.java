package com.springapp.springdata.onetoone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "st")
public class Student {
    @Column(name = "stid")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String stdId;
    @Column(name = "stname")
    private String stdName;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdId() {
        return stdId;
    }
}
