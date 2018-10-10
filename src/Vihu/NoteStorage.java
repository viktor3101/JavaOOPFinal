package Vihu;

public interface NoteStorage {
    Note findById(long id);
    void save(Note note);
    void deleteById(long id);
}