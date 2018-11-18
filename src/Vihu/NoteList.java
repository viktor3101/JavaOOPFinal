package Vihu;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NoteList implements NoteStorage, Serializable {
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
			s.addAll(notes);
		} else {
			for (int i = notes.size() - 4; i < notes.size(); i++) {
				s.add(notes.get(i));
			}
		}
		return s;
	}

	public List sortNotesByDate() {
		List sortedNotes = new ArrayList<>();
		String tempStr = UserIO.askSorting();
		if (tempStr.equals("yes")) {
			sortedNotes = new ArrayList<>(notes);
		} else {
			for (int i = notes.size() - 1; i >= 0; i--) {
				sortedNotes = revers(notes);
			}
		}
		return sortedNotes;
	}

	private List revers(List<Note> list) {
		List<Note> templist = new ArrayList<>();
		for (int i = templist.size(); i >= 0; i--) {
			templist.add(list.get(i));
		}
		return templist;
	}

	public List filterNotesByFeelings(){
		int temp = UserIO.askFiltering();
		switch(temp){
			case 1:return sortForFiltering(Feeling.GOOD);
			case 2:return sortForFiltering(Feeling.PERFECT);
			case 3:return sortForFiltering(Feeling.THE_BEST);
			case 4:return sortForFiltering(Feeling.SOSO);
			case 5:return sortForFiltering(Feeling.CRAZY);
			case 0: return null;
			default: return null;
		}
	}

	List sortForFiltering(Feeling feel){
		List<Note> tempList = new ArrayList<>();
		for (Note note:notes) {
			if (note.getFeeling().equals(feel)){
				tempList.add(note);
			}
		}
		return tempList;
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
