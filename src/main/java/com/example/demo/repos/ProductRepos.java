package com.example.demo.repos;

import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepos  extends CrudRepository<Product, Long>{
}
