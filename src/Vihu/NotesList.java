package Vihu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotesList implements NoteStorage{
    private final List<Note> notes = new ArrayList<>();

    public void addNote() {
        notes.add(NoteConsoleReader.readNote());
    }

    public void addNote(String note, String feelings, LocalDateTime dateTime) {

        notes.add(new Note(note, dateTime, feelings));
    }

    public String findByDate(LocalDateTime date) {
        StringBuilder tempString = new StringBuilder("|" + date);
        int i = 1;
        for (Note note : notes) {
            if (date.equals(note.getDate())) {
                tempString.append("|").append(i).append("| ").append(note.getNote()).append("\n|   ").append(note.getFeelings());
                i++;
            }
        }
        if (tempString.toString().equals("|" + date)) {
            return "NoteConsoleReader notes were found";
        } else {
            return tempString.toString();
        }
    }

    public String lastFourNotes(int notesCount) {
        int temp = notes.size() - 1;
        String tempStr = "Notes: \n";
        if (temp >= notesCount) {
            for (int i = temp; i > temp - notesCount; i--) {
                tempStr += notes.get(i).toString() + "\n";
            }
        } else {
            for (int i = temp;i>=0;i--) {
                tempStr += notes.get(i).toString() + "\n";
            }
        }
        return tempStr;
    }

    @Override
    public Note findById(long id) {
        return null;
    }

    @Override
    public void save(Note note) {

    }

    @Override
    public void deleteById(long id) {

    }
}
