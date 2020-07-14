package org.sid.immobiliers.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Sliders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String link;
    @OneToMany(mappedBy = "slider")
    private Collection<Slider_translations> sliders;

}
