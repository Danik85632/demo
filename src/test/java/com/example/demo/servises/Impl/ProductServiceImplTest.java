package com.example.demo.servises.Impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Product;
import com.example.demo.models.Storage;
import com.example.demo.repos.ProductRepos;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceImplTest {
    private final ProductServiceImpl service;

    @Autowired
    public ProductServiceImplTest(ProductServiceImpl service) {
        this.service = service;
    }

    @MockBean
    private ProductRepos repos;

    @Test
    void createProduct() {
        var storage = new Storage();
        var product = new Product();
        var productList = new ArrayList<Product>();
        productList.add(product);
        storage.setId(100500L);
        storage.setProducts(productList);

        product.setId(100500L);
        product.setCost(50.5);
        product.setProduct("Тест");
        product.setQuality(3L);
        product.setStorage(storage);

        Assert.assertTrue(service.createProduct(product));

    }

    @Test
    void editProduct() {
    }

    @Test
    void getProductById() {
    }

    @Test
    void getAllProduct() {
    }

    @Test
    void deleteProduct() {
    }


}