package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String product;

    @Column(nullable = false)
    private Double cost;

    @Column(nullable = false)
    private Long quality;

    @ManyToOne(fetch = FetchType.LAZY)
    private Storage storage;

    public Integer getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public Double getCost() {
        return cost;
    }

    public Long getQuality() {
        return quality;
    }

    public Storage getStorage() {
        return storage;
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

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
