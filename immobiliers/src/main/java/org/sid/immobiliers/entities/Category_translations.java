package org.sid.immobiliers.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Category_translations {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Categorie categorie;
    @Enumerated(EnumType.STRING)
    private Locale status;
    private String Slug;
    private String name;
}
