package com.springapp.springdata.manytomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product_table")
public class Product {
    @Id
    private String prodId;
    private String prodName;

    @ManyToMany(mappedBy = "product")
    private List<Category> category;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
}
