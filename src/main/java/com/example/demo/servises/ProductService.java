package com.example.demo.servises;

import java.util.Optional;

import com.example.demo.models.Product;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface ProductService {
    Optional<Product> getProductById(long Id);

    Iterable<Product> getAllProduct();

    void createProduct(Product product);

    void deleteProduct(Long id);
}
