package com.example.demo.servises.Impl;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.models.Product;
import com.example.demo.repos.ProductRepos;
import com.example.demo.servises.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepos repos;

    @Autowired
    public ProductServiceImpl(ProductRepos repos) {
        this.repos = repos;
    }

    @Override
    public Product getProductById(long id) {
        return repos.findById(id).orElseThrow();
    }

    @Override
    public Collection<Product> getAllProduct() {
        return repos.findAll();
    }

    @Override
    public boolean createProduct(Product product) {
        var productFromDb = repos.findById(product.getId());
        if (productFromDb.isPresent()) {
            return false;
        }

        repos.save(product);

        return true;
    }

    @Override
    public void deleteProduct(Long id) {
        repos.deleteById(id); //проверку и возвращать бул
    }

    @Override
    public void editProduct(Product product) {
        repos.save(product); //проверку и возвращать бул
    }
}
