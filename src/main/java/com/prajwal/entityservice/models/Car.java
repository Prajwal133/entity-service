package com.prajwal.entityservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseModel {
    @Column(nullable = false, unique = true)
    private String plateNumber;
    private String brand;
    private String model;

    @Enumerated(EnumType.STRING)
    private CarType carType;
    @ManyToOne
    private Color color;

    @OneToOne
    private Driver driver;

}
