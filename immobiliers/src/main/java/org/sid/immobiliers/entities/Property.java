package org.sid.immobiliers.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Property {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String slug;
    private String titre;
    private Double prix;
    private String adresse;
    private String description;
    private String video;
    private Boolean isFavorite;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date renewed_at;
    private int nombre_facades;
    private int surface_habitable;
    private int surface_totale;
    private String imageHeader;
    private int nombre_chmbre;
    @OneToMany(mappedBy = "property")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Collection<Property_images> images_property;
    @OneToMany(mappedBy = "property")
    @JsonProperty(access= JsonProperty.Access.READ_WRITE)
    private Collection<Property_user> userproperty;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Users user;
    @ManyToOne
    private type_transaction transaction;
    private String ville;
    @OneToMany(mappedBy = "property")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Collection<Feature> features
            ;
}
