package org.sid.immobiliers.entities;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Contents {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String avatar;
    private String thumbnail;
    private Byte statut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updated_at;
}
