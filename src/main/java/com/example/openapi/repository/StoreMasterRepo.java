package com.example.openapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.openapi.model.StoreMaster;

public interface StoreMasterRepo extends JpaRepository<StoreMaster, Long> {
    
}
