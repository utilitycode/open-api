package com.example.openapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.openapi.model.StoreMaster;
import com.example.openapi.service.StoreMasterService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(path = "/v1")
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    private final StoreMasterService storeMasterService;
       
    public HomeController(StoreMasterService storeMasterService) {
        this.storeMasterService = storeMasterService;
    }
   
    @Operation(summary = "An entry method to the API")
    @GetMapping(path = "/welcome")
    public String welcome() {
        logger.info("eneterd into controller");
        return "welcome to Open API impmentation";
    }

    @Operation(summary = "API to add new Stores")
    @PostMapping(path = "/store", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StoreMaster> addStore(@RequestBody final StoreMaster storeMaster){
        storeMasterService.addStore(storeMaster);
        return new ResponseEntity<>(storeMaster, HttpStatus.CREATED);
    }

    @PutMapping(path = "/store/{store_no}")
    public ResponseEntity<StoreMaster> updateStore(@RequestBody final StoreMaster storeMaster, @PathVariable("store_no") String storeNo){
        storeMasterService.updateStore(storeMaster);
        return new ResponseEntity<>(storeMaster, HttpStatus.OK);
    }
     
}
