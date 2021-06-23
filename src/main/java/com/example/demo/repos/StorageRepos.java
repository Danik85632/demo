package com.example.demo.repos;

import com.example.demo.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepos extends JpaRepository<Storage, Long> {

}
