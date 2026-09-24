package com.prajwal.entityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NamedLocation extends BaseModel {
    private String name;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    @OneToOne
    private ExactLocation exactLocation;
}
