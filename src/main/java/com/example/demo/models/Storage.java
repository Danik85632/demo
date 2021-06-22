package com.example.demo.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "storages")
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(
        mappedBy = "storage",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private Collection<Product> products = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
