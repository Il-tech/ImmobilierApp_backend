package org.sid.immobiliers.services;

import org.sid.immobiliers.dao.CategorieRepository;
import org.sid.immobiliers.entities.Category_translations;
import org.sid.immobiliers.dao.Categorie_translationsRepository;
import org.sid.immobiliers.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

@Service
@Transactional
public class initImmobilierService implements IinitImmobilierService {
    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private Categorie_translationsRepository catTranslate;

    @Override
    public void initCategories() {

        
    }

    @Override
    public void initProperties() {

    }


}
