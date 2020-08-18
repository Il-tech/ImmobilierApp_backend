package org.sid.immobiliers.services;

import org.apache.catalina.User;
import org.sid.immobiliers.dao.*;

import org.sid.immobiliers.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

@Service
@Transactional
public class initImmobilierService implements IinitImmobilierService {
    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private PropertiesRepository propertyRepository;
    @Autowired
    private type_transaction_repository transRepository;
    @Autowired
    private Property_imagesRepository imgRepo;

    @Autowired
    private FeaturesRepository features_repo;
    @Autowired
    private UserRepository user_repo;


    @Override
    public void initCategories() {
        Stream.of("Appartment", "Bureau et plateau", "Villa et maison", "magasin et commerce", "terrain et ferme", "local industriel").forEach(cat -> {
            Category category = new Category();
            category.setName(cat);
            categorieRepository.save(category);
        });

    }

    @Override
    public void InitAminities() {

        String[] features = new String[]{"available","not available"};
        propertyRepository.findAll().forEach(prop-> {
            for (int i = 0; i < prop.getNombre_facades(); i++) {
                Stream.of("chemine", "climatisation","chauffage ","securite","terrasse"," meublé","refrigerateur","jardin","titree").forEach(featureName ->
                        {
                            Feature feature = new Feature();
                            feature.setFeature_name(featureName);
                            feature.setFeature_value((String) features[new Random().nextInt(features.length)]);
                            feature.setProperty(prop);
                            features_repo.save(feature);
                        }
                );
            }
        });
    }


    @Override
    public void initProperties() {
        double[] nbre = new double[]{1, 1.5, 2, 2.5, 3};
        String[] ville = new String[]{"Casablanca", "Marrakech", "Rabat", "Tanger"};
        List<Category> categories = categorieRepository.findAll();
        List<Feature> features = features_repo.findAll();
        List<type_transaction> trans = transRepository.findAll();
        List<Users> user = user_repo.findAll();

        Stream.of(" Anarjiss", "Essalam", "Green eyes", "La Ligne Verte", "maroc ferme",
                "laurem", "marbella", "seniin", "elmustqbal", "La boulangerie", "maroc ferme",
                "laurem").forEach(titreProperty -> {
            Property property = new Property();
            property.setTitre(titreProperty);
            property.setIsFavorite(false);
            property.setSlug(titreProperty);
            property.setAdresse("Tokyo square, Japan -");
            property.setDescription("This upscale, contemporary hotel is 2 km from Hazrat Shahjalal " +
                    "International Airport and 11 km from Jatiyo Sangsad Bhaban, " +
                    "the Bangladesh Parliament complex.");
            property.setPrix(nbre[new Random().nextInt(nbre.length)]);
            property.setNombre_facades(((int) nbre[new Random().nextInt(nbre.length)]));
            property.setNombre_chmbre((int) nbre[new Random().nextInt(nbre.length)]);
            property.setSurface_habitable(((int) nbre[new Random().nextInt(nbre.length)]));
            property.setSurface_totale((int) nbre[new Random().nextInt(nbre.length)]);
            property.setRenewed_at(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
            property.setTitre(titreProperty.replaceAll(" ", ""));
            property.setCategory(categories.get(new Random().nextInt(categories.size())));
            property.setImageHeader("house" + ".jpg");
            property.setUser(user.get(new Random().nextInt(user.size())));
            property.setVille((String) ville[new Random().nextInt(ville.length)]);
            property.setTransaction(trans.get(new Random().nextInt(trans.size())));
            propertyRepository.save(property);
        });
    }



    @Override
    public void initImages() {
        propertyRepository.findAll().forEach(property -> {
            Property_images img = new Property_images();
            img.setImages_desc(property.getSlug().replaceAll(" ", "") + ".jpg");
            img.setFistImg(property.getSlug().replaceAll(" ", "") + ".jpg");
            img.setSecondImg(property.getSlug().replaceAll(" ", "") + ".jpg");
            img.setThirdImg(property.getSlug().replaceAll(" ", "") + ".jpg");
            imgRepo.save(img);

        });
    }

    @Override
    public void initUser() {
        Stream.of("Ilham khalyl", "Kenza feshtali").forEach(name -> {
            Users user= new Users();
            user.setName(name);
            user.setAdresse("venue Annakhil Hay Riad -Rabat-Maroc");
            user.setEmail("khalililham10@gmail.com");
            user.setVille("tanger");
            user.setTelephone("+212 537 71 90 00");
            user.setCode_postal("40000");
            user_repo.save(user);
        });
    }

    @Override
    public void initTypeTransaction() {
        Stream.of("A vendre", "A louer").forEach(transactionType -> {
            type_transaction typeTrans = new type_transaction();
            typeTrans.setType_name(transactionType);
            transRepository.save(typeTrans);
        });

    }


}
