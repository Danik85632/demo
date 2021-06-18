package com.example.demo.controller;

import com.example.demo.models.Product;
import com.example.demo.repos.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private final ProductRepos repos;

    @Autowired
    public ProductController(ProductRepos repos) {
        this.repos = repos;
    }

    @GetMapping
    public String indexPage(Model model){
        //model.addAttribute("items", repos.findAll());
        //model.addAttribute("item", new Product());
        return "index"; //главную страницу возвращаем
    }

    @PostMapping
    public String newProductItem(Product product){
        repos.save(product);
        return "redirect:/";
    }
}
