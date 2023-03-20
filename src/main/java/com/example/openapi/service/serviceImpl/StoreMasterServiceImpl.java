package com.example.openapi.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.openapi.model.StoreMaster;
import com.example.openapi.repository.StoreMasterRepo;
import com.example.openapi.service.StoreMasterService;

@Service
public class StoreMasterServiceImpl implements StoreMasterService{

    private final StoreMasterRepo storeMasterRepo;

    public StoreMasterServiceImpl(StoreMasterRepo storeMasterRepo) {
        this.storeMasterRepo = storeMasterRepo;
    }

    @Override
    public StoreMaster addStore(final StoreMaster storeMaster) {
        storeMasterRepo.save(storeMaster);
        return storeMaster;
    }
    
}
