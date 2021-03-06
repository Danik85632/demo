package com.example.demo.repos;

import com.example.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepos extends JpaRepository<Product, Long> {
}
