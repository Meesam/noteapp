package com.meesam.noteapp.controller;

import com.meesam.noteapp.dto.NoteRequest;
import com.meesam.noteapp.dto.NoteResponse;
import com.meesam.noteapp.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("/save")
    public ResponseEntity<NoteResponse> save(@RequestBody NoteRequest inputNote) {
        return new ResponseEntity<>(noteService.saveNote(inputNote), HttpStatus.CREATED);
    }
}
