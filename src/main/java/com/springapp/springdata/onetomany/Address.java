package com.springapp.springdata.onetomany;

import com.springapp.springdata.repositories.StudentOneToManyDAO;
import jakarta.persistence.*;

@Entity
@Table(name = "address_table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String addressId;
    private String city;
    private String country;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentOneToMany studentOneToMany;

    public StudentOneToMany getStudentOneToMany() {
        return studentOneToMany;
    }

    public void setStudentOneToMany(StudentOneToMany studentOneToMany) {
        this.studentOneToMany = studentOneToMany;
    }



    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
