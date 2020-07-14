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
public class Testimonial_translations {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Testimonials testimonial;
    @Enumerated(EnumType.STRING)
    private Locale locale;
    private String name;
}
