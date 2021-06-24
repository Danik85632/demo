package com.example.demo.servises.Impl;

import com.example.demo.repos.StorageRepos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class StorageServiseImplTest {
    private final StorageRepos repos;

    @Autowired
    public StorageServiseImplTest(StorageRepos repos) {
        this.repos = repos;
    }
    @Test
    void getStorageById() {
    }

    @Test
    void getAllStorage() {
    }

    @Test
    void createStorage() {
    }

    @Test
    void deleteStorage() {
    }

    @Test
    void editStorage() {
    }
}