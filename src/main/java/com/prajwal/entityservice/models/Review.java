package com.prajwal.entityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review extends BaseModel {
    private String content;
    private Double rating;

    @Enumerated(EnumType.STRING)
    private ReviewerType reviewerType;

    private Long bookingId;
    private Long reviewerId;  // who wrote it — passenger OR driver, doesn't matter which
    private Long revieweeId;  // who it's about — the other party
}