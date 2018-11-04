package Vihu;

public interface NoteStorage {
    Note findById(long id);
    void AddNote(Note note, Long id);
    void deleteById(long id);
}