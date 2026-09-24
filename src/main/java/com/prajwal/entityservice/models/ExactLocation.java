package com.prajwal.entityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExactLocation extends BaseModel{
    private Double latitude;
    private Double longitude;
}
