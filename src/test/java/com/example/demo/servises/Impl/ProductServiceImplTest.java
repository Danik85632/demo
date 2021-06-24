package com.example.demo.servises.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.Product;
import com.example.demo.models.Storage;
import com.example.demo.repos.ProductRepos;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
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
    void createProductTest() {
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
        Mockito.verify(repos, Mockito.times(1)).save(product);
    }

    @Test
    void createProductFailTest() {
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

        Mockito.when(repos.findById(100500L)).thenReturn(Optional.of(new Product()));

        boolean isCreated = service.createProduct(product);

        Assert.assertFalse(isCreated);
        Mockito.verify(repos, Mockito.times(1)).findById(100500L);
        Mockito.verify(repos, Mockito.times(0)).save(ArgumentMatchers.any(Product.class));
    }

    @Test
    void editProductTest() {
    }

    @Test
    void getProductByIdTest() {
    }

    @Test
    void getAllProductTest() {
    }

    @Test
    void deleteProduct() {
    }


}