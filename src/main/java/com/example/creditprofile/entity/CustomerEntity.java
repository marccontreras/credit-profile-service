package com.example.creditprofile.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 120)
    private String fullName;

    @Column(name = "credit_score", nullable = false)
    private Integer creditScore;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @PrePersist
    void onCreate() {
        if (createdAt == null) createdAt = Instant.now();
    }

    public CustomerEntity() {}

    public CustomerEntity(String fullName, Integer creditScore) {
        this.fullName = fullName;
        this.creditScore = creditScore;
    }

    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public Integer getCreditScore() { return creditScore; }
    public Instant getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setCreditScore(Integer creditScore) { this.creditScore = creditScore; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
