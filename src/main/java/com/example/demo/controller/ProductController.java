package com.example.demo.controller;

import java.util.Collection;
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
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("getProductById")
    public Product getProductById(long id){
       return productService.getProductById(id);
    }

    @GetMapping("getAllProduct")
    public Collection<Product> getAllProduct(Model model){
        return productService.getAllProduct();
    }

    @PostMapping("createProduct")
    public Product createProduct(Product product){
        return productService.createProduct(product);
    }

    @PostMapping("editProduct")
    public void changeElement(Product product){
        productService.editProduct(product);
    }

    @DeleteMapping("deleteProduct")
    public void deleteProduct(Long id){
        productService.deleteProduct(id);
    }
}
