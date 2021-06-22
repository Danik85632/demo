package com.example.demo.servises;

import java.util.Collection;
import com.example.demo.models.Storage;

public interface StorageService {
    Storage getStorageById(long Id);

    Collection<Storage> getAllStorage();

    Storage createStorage(Storage storage);

    void deleteStorage(Long id);

    void editStorage(Storage storage);
}
