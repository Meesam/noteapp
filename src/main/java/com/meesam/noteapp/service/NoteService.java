package com.meesam.noteapp.service;

import com.meesam.noteapp.dto.NoteRequest;
import com.meesam.noteapp.dto.NoteResponse;
import com.meesam.noteapp.model.Note;
import com.meesam.noteapp.repository.NoteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    @Transactional
    public NoteResponse saveNote(NoteRequest noteRequest){
        Note note = new Note();
        note.setTitle(noteRequest.title());
        note.setDescription(noteRequest.description());
        note.setIsCompleted(false);
        Note noteSaved = noteRepository.save(note);
        return new NoteResponse(
                noteSaved.getId(),
                noteSaved.getTitle(),
                noteSaved.getDescription(),
                noteSaved.getIsCompleted()
        );
    }
}
