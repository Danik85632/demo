package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String product;

    @Column(nullable = false)
    private Double cost;

    public String getProduct() {
        return product;
    }

    public Double getCost() {
        return cost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }
}
