package org.sid.immobiliers.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class type_transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    String type_name;
    @OneToMany(mappedBy = "transaction")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)

    private Collection<Property> properties;
}
