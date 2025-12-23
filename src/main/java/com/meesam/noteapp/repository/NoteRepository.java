package com.meesam.noteapp.repository;

import com.meesam.noteapp.model.Note;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Id> {
}
