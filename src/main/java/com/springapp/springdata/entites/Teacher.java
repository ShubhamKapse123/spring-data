package com.springapp.springdata.entites;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("teacher_master")
public class Teacher {
    @Id
    private long techId;
    private String techName;

    public Teacher() {
    }

    public Teacher(long techId, String techName) {
        this.techId = techId;
        this.techName = techName;
    }
}
