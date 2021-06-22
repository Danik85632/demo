package com.example.demo.servises;

import java.util.Optional;

import com.example.demo.models.Product;

public interface ProductService {
    Optional<Product> getProductById(long Id);

    Iterable<Product> getAllProduct();

    void createProduct(Product product);

    void deleteProduct(Long id);

    void changeProductElement(Product product);
}
