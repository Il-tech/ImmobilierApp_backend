package org.sid.immobiliers;



import org.sid.immobiliers.services.IinitImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ImmobiliersApplication  implements CommandLineRunner{
    @Autowired
    private IinitImmobilierService initImmobilierService;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(ImmobiliersApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        initImmobilierService.initCategories();
    }
}
