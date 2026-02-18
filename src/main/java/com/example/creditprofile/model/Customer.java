package com.example.creditprofile.model;

public class Customer {
    private Long id;
    private String name;
    private int creditScore;

    public Customer() {
    }

    public Customer(Long id, String name, int creditScore) {
        this.id = id;
        this.name = name;
        this.creditScore = creditScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}