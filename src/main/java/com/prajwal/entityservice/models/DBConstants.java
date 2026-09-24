package com.prajwal.entityservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DBConstants extends BaseModel{

    @Column(nullable = false, unique = true)
    private String name ;
    private String value;
}
