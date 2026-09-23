package com.prajwal.entityservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
/*
An entity listener is a class that listens to lifecycle events of a JPA entity and  handle auditing.
*/
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected Date createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    protected Date updatedAt;
}