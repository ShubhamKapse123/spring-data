package com.springapp.springdata.onetomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "st")
public class StudentOneToMany {
    @Column(name = "stid")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String stdId;
    @Column(name = "stname")
    private String stdName;

    //store many address
    @OneToMany(mappedBy = "studentOneToMany",cascade = CascadeType.ALL)
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
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
