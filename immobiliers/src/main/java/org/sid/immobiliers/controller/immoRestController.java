package org.sid.immobiliers.controller;

import org.sid.immobiliers.dao.PropertiesRepository;
import org.sid.immobiliers.entities.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class immoRestController {
    @Autowired
    PropertiesRepository propertieRepo;
    @GetMapping("/listProperties")
    public List<Property> propertiesList()
    {
        return propertieRepo.findAll();
    }



}
