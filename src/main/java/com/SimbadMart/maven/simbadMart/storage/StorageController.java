package com.SimbadMart.maven.simbadMart.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class StorageController {

    @Autowired
    StorageRepository storageRepository;



}
