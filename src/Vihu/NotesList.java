package Vihu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static Vihu.NoteConsoleReader.*;

class NotesList {
    private final List<Note> notes = new ArrayList<>();
    void addNote() {
        notes.add(readNote());
    }

    String findByDate(LocalDateTime date) {
        StringBuilder tempString = new StringBuilder("|" + date);
        int i = 1;
        for (Note note : notes) {
            if (date == note.date) {
                tempString.append("|").append(i).append("| ").append(note.note).append("\n|   ").append(note.feelings);
                i++;
            }
        }
        if (tempString.toString().equals("|" + date)) {
            return "NoteConsoleReader notes were found";
        } else {
            return tempString.toString();
        }
    }

    String lastFourNotes(int notesCount) {
        int temp = notes.size();
        StringBuilder tempStr = new StringBuilder();
        if (temp >= notesCount) {
            for (int i = temp; i > temp - notesCount; i--) {
                tempStr.append(notes.get(i).toString()).append("\n");
            }
        } else {
            for (Note note : notes) {
                tempStr.append(note.toString()).append("\n");
            }
        }
        return tempStr.toString();
    }
}
