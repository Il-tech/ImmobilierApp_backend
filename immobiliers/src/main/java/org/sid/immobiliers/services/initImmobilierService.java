package org.sid.immobiliers.services;

import org.sid.immobiliers.dao.CategorieRepository;
import org.sid.immobiliers.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
@Service
@Transactional
public class initImmobilierService implements   IinitImmobilierService{
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void initCategories() {
        String[] images = new String[]{"appartement_header_image.jpg", "villa_et_maison_header_image.jpg", "bureau_et_plateau_index_image.jpg", "magasin_et_commerce_index_image.jpg", "terrain_et_ferme_index_image.jpg", "locale_industriel_index_image.jpg"};
        int i;
        for (i = 0; i < 6; i++) {
            Categorie cat = new Categorie();
            cat.setHeader_images(images[i]);
            Stream.of("appartement_index_image", "villa_et_maison_index_image", "bureau_et_plateau_index_image", "magasin_et_commerce_index_image", "\t\n" +
                    "terrain_et_ferme_index_image", "locale_industriel_index_image"
            ).forEach(index_image -> {
                cat.setIndex_images(index_image + ".jpg");
                cat.setCreated_at(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
                cat.setUpdateed_at(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
                categorieRepository.save(cat);
            });
        }
    }

    @Override
    public void initCategoriesTranslation() {

    }


}
