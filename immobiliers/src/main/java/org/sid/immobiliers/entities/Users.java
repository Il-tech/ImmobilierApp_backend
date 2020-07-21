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
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String telephone;
    private byte genre;
    private String ville;
    private String adresse;
    private String nom_agence;
    private String fonction_agence;
    private String code_postal;
    private String avatar;
    private String social_id;
    private String social_type;
    private String email;
    private String facebook;
    private String twitter;
    private String google;
    private String linkedin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date email_verified_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approved_at;
    private byte banned;
    private String password;
    private String remember_token;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updated_at;
    @OneToMany(mappedBy = "user")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Properties> property;



}
