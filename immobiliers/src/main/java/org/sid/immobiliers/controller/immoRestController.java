package org.sid.immobiliers.controller;

import org.sid.immobiliers.dao.CategorieRepository;
import org.sid.immobiliers.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class immoRestController {
    @Autowired
    CategorieRepository categorieRepo;



}
