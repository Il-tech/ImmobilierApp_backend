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
public class Password_reset {
    @Id
    private String email;
    private String token;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at;

}
