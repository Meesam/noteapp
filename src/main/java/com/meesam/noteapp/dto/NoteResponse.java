package com.meesam.noteapp.dto;

public record NoteResponse(
        Long id,
        String title,
        String description,
        Boolean isCompleted
) {
}
