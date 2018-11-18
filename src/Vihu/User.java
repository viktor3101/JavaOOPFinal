package Vihu;

import java.io.*;
import java.time.LocalDateTime;
import java.util.List;

public class User implements Serializable {
	private String username;
	private String password;
	private final long id;
	private final NoteList noteList = new NoteList();

	public User(String username, String password, long id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}

	public void addNote(Note note) {
		noteList.addNote(note);
	}

	public void addNoteFromFile(String filePath) throws FileNotFoundException {
		try {
			BufferedReader in = new BufferedReader(new FileReader(filePath));
			String tempStr = in.readLine();
			noteList.addNote(new Note(tempStr, LocalDateTime.now(), UserIO.feelingsFilter()));
			in.close();
		} catch (IOError error) {
			UserIO.invalidPath();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeNotesInFile(){
		noteList.writeNotesInFile(username);
	}

	public String getUname() {
		return username;
	}

	public String getPass() {
		return password;
	}

	public long getId() {
		return id;
	}

	public void changePass(String pass) {
		UserIO.pasChange(username);
		if (pass.equals(password)) {
			password = UserIO.pas();
		}
	}

	public void changeUname(String uname) {
		UserIO.unChange(username);
		if (uname.equals(username)) {
			username = UserIO.un();
		}
	}

	public void deleteByDate(LocalDateTime date) {
		noteList.deleteByDate(date);
	}

	public List sortingNotesByDate() {
		return noteList.sortNotesByDate();
	}

	public List filteringNotesByFeelings() {
		return noteList.filterNotesByFeelings();
	}

	public List showLastNotes() {
		return noteList.showLastNotes();
	}
}
