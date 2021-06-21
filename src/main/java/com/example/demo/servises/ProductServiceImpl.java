package com.example.demo.servises;

import java.util.Optional;

import com.example.demo.models.Product;
import com.example.demo.repos.ProductRepos;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepos repos;
    public ProductServiceImpl(ProductRepos repos) {
        this.repos = repos;
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return repos.findById(id);
    }

    @Override
    public Iterable<Product> getAllProduct() {
        return repos.findAll();
    }

    @Override
    public void createProduct(Product product) {
        repos.save(product); //проверку и возвращать бул
    }

    @Override
    public void deleteProduct(Long id) {
        repos.deleteById(id); //проверку и возвращать бул
    }

    @Override
    public void changeElement(Product product) {
        repos.save(product); //проверку и возвращать бул
    }
}
