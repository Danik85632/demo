package com.example.demo.controller;

import java.util.Optional;

import com.example.demo.models.Storage;
import com.example.demo.servises.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(path = "byId")
    public Optional<Storage> getProductById(long id){
        return storageService.getStorageById(id);
    }

    @GetMapping(path = "all")
    public Iterable<Storage> getProduct(Model model){
        return storageService.getAllStorage();
    }

    @PostMapping(path = "create")
    public void createProduct(Storage storage){
        storageService.createStorage(storage);
    }

    @PostMapping(path = "change")
    public void changeElement(Storage storage){
        storageService.changeStorageElement(storage);
    }

    @DeleteMapping
    public void deleteProduct(Long id){
        storageService.deleteStorage(id);
    }
}
