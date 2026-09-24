package com.prajwal.entityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(value = "bookings")
public class Passenger extends BaseModel {

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "passenger")
    private List<Booking> bookings = new ArrayList<>();

    @DecimalMin(value = "0.00" , message = "rating must be greater than or equal to 0")
    @DecimalMax(value = "5.00" , message = "rating must  be  less than or equal to  5")
    private Double rating;

    @OneToOne
    private ExactLocation  homeLocation;
}
