package com.example.creditprofile.dto;

import java.time.Instant;

public record CustomerResponse(
        Long id,
        String fullName,
        Integer creditScore,
        Instant createdAt
) {}
