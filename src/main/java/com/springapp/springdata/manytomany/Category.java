package com.springapp.springdata.manytomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category_table")
public class Category {
    @Id
    private String catID;
    private String catName;

    //eager means when we call method at same time they load data
    //lazy meas on demand they load the data
    @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Product> product;

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
