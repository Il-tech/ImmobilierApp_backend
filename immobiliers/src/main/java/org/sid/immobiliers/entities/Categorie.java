package org.sid.immobiliers.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Categorie implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "categorie")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Collection<Category_translations> cat_translation;
    @OneToMany(mappedBy = "categorie")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Collection<Subscribers> subscribers;
    @OneToMany(mappedBy = "categorie")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Collection<Properties> properties;


}
