package com.example.demo.controller;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.models.Storage;
import com.example.demo.servises.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StorageController {
    private StorageService storageService;

    @Autowired
    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

   @GetMapping("getStorageById")
    public Storage getProductById(long id){
        return storageService.getStorageById(id);
    }

    @GetMapping(path = "getAllStorage")
    public Collection<Storage> getProduct(Model model){
        return storageService.getAllStorage();
    }

    @PostMapping(path = "createStorage")
    public Storage createProduct(Storage storage){
        return storageService.createStorage(storage);
    }

    @PostMapping(path = "editStorage")
    public void changeElement(Storage storage){
        storageService.editStorage(storage);
    }

    @DeleteMapping("deleteStorage")
    public void deleteStorage(Long id){
        storageService.deleteStorage(id);
    }

}
