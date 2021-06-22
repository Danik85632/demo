package com.example.demo.repos;

import com.example.demo.models.Storage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepos extends CrudRepository<Storage, Long> {


}
