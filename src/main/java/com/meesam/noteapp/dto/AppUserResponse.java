package com.meesam.noteapp.dto;

import java.time.LocalDateTime;

public record AppUserResponse(
        Long id,
        String name,
        String email,
        String role,
        String CreatedBy,
        String LastModifiedBy,
        LocalDateTime CreatedAt,
        LocalDateTime UpdatedAt
) {
}
