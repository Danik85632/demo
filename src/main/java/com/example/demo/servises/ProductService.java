package com.example.demo.servises;

import java.util.Collection;
import com.example.demo.models.Product;

public interface ProductService {
    Product getProductById(long Id);

    Collection<Product> getAllProduct();

    Product createProduct(Product product);

    void deleteProduct(Long id);

    void editProduct(Product product);
}
