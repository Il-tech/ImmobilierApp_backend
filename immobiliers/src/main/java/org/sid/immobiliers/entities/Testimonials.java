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
public class Testimonials {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String image;
    @OneToMany(mappedBy = "testimonial")
    private Collection<Testimonial_translations> testimonials;

}
