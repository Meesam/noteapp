package com.meesam.noteapp.controller;

import com.meesam.noteapp.model.Note;
import com.meesam.noteapp.repository.NoteRepository;
import com.meesam.noteapp.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/note")
public class NoteController {
    private final NoteService noteService;
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/save")
    public Note save() {
        Note note = new Note();
        note.setTitle("title");
        note.setCompleted(false);
        note.setCreatedDate(LocalDate.now());
        note.setDescription("description");
        noteService.saveNote(note);
        return note;
    }
}
