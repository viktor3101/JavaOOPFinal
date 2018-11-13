package Vihu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NoteList implements NoteStorage {
	private final List<Note> notes = new ArrayList<Note>();

	public void addNote(Note note) {
		notes.add(note);
	}

	public void deleteByDate(LocalDateTime dateTime) {
		int temp = 0;
		for (int i = 0; i < notes.size(); i++) {
			if (notes.get(i).getDate().equals(dateTime)) {
				temp = i;
			}
		}
		notes.remove(temp);
	}

	public List showLastNotes() {
		List<Note> s = new ArrayList<>();
		if (notes.size() <= 4) {
			for (Note note : notes) {
				s.add(note);
			}
		} else {
			for (int i = notes.size() - 4; i < notes.size(); i++) {
				s.add(notes.get(i));
			}
		}
		return s;
	}

//For future
	@Override
	public Note findById(long id) {
		return null;
	}

	@Override
	public void AddNote(Note note, Long id) {

	}

	@Override
	public void deleteById(long id) {

	}
}
