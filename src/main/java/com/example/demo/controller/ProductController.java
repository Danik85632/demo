package com.example.demo.controller;

import java.util.Optional;

import com.example.demo.models.Product;
import com.example.demo.servises.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "byId")
    public Optional<Product> getProductById(long id){
       return productService.getProductById(id);
    }

    @GetMapping(path = "all")
    public Iterable<Product> getProduct(Model model){
        return productService.getAllProduct();
    }

    @PostMapping
    public void createProduct(Product product){
        productService.createProduct(product);
    }

    @PostMapping
    public void changeElement(Product product){
        productService.changeProductElement(product);
    }

    @DeleteMapping
    public void deleteProduct(Long id){
        productService.deleteProduct(id);
    }
}
