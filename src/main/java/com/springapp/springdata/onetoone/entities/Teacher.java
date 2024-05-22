package com.springapp.springdata.onetoone.entities;



public class Teacher {
    private long techId;
    private String techName;

    public Teacher() {
    }

    public Teacher(long techId, String techName) {
        this.techId = techId;
        this.techName = techName;
    }
}
