package com.example.demo.servises.Impl;

import java.util.Optional;

import com.example.demo.models.Storage;
import com.example.demo.repos.StorageRepos;
import com.example.demo.servises.StorageService;
import org.springframework.stereotype.Service;

@Service
public class StorageServiseImpl implements StorageService {

    private final StorageRepos repos;
    public StorageServiseImpl(StorageRepos repos) {
        this.repos = repos;
    }

    @Override
    public Optional<Storage> getStorageById(long id) {
        return repos.findById(id);
    }

    @Override
    public Iterable<Storage> getAllStorage() {
        return repos.findAll();
    }

    @Override
    public void createStorage(Storage storage) {
        repos.save(storage);
    }

    @Override
    public void deleteStorage(Long id) {
        repos.deleteById(id);
    }

    @Override
    public void changeStorageElement(Storage storage) {
        repos.save(storage);
    }
}
