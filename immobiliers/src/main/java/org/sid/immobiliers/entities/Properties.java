package org.sid.immobiliers.entities;

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
public class Properties {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int user_id;
    private String slug;
    private String type_transaction;
    private long type_propriete;
    private String titre;
    private Double prix;
    private String ville;
    private String adresse;
    private String description;
    private String video;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date renewed_at;
    private int nombre_facades;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hidden_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updated_at;
    @OneToMany(mappedBy = "property")
    private Collection<Features> Features;
    @OneToMany(mappedBy = "property")
    private Collection<Property_images> images_property;
    @OneToMany(mappedBy = "property")
    private Collection<Property_user> userproperty;

}
