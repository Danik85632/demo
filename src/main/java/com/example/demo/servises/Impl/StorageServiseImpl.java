package com.example.demo.servises.Impl;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.models.Storage;
import com.example.demo.repos.StorageRepos;
import com.example.demo.servises.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiseImpl implements StorageService {
    private final StorageRepos repos;

    @Autowired
    public StorageServiseImpl(StorageRepos repos) {
        this.repos = repos;
    }

    @Override
    public Storage getStorageById(long id) {
        return repos.findById(id).orElseThrow();
    }

    @Override
    public Collection<Storage> getAllStorage() {
        return repos.findAll();
    }

    @Override
    public Storage createStorage(Storage storage) {
        return repos.save(storage);
    }

    @Override
    public void deleteStorage(Long id) {
        repos.deleteById(id);
    }

    @Override
    public void editStorage(Storage storage) {
        repos.save(storage);
    }
}
