package org.sid.immobiliers.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Types {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int images;
    private int properties;
    private byte video;
    private byte renewable;
    private int renewable_one_property;
    private int renewable_all_properties;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateed_at;
}
