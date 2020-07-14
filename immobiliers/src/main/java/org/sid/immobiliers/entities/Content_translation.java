package org.sid.immobiliers.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Content_translation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Locale status;
    private String slug;
    private String contenu;
    private String seo_titre;
    private String seo_description;
}
