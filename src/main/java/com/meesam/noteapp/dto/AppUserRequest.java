package com.meesam.noteapp.dto;

public record AppUserRequest(
        String name,
        String email,
        String password,
        String role
) {
}
