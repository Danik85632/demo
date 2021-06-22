package com.example.demo.servises;

import java.util.Optional;
import com.example.demo.models.Storage;

public interface StorageService {
    Optional<Storage> getStorageById(long Id);

    Iterable<Storage> getAllStorage();

    void createStorage(Storage storage);

    void deleteStorage(Long id);

    void changeStorageElement(Storage storage);
}
