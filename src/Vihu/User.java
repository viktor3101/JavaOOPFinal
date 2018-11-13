package Vihu;

import java.time.LocalDateTime;
import java.util.List;

public class User {
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

	public String getUname() {
		return username;
	}

	public String getPass() {
		return password;
	}

	public long getId(){
		return id;
	}

	public void changePass(String pass){
		UserIO.pasChange(username);
		if(pass==password){
			password = UserIO.pas();
		}
	}

	public void changeUname(String uname){
		UserIO.unChange(username);
		if (uname==username){
			username = UserIO.un();
		}
	}

	public void deleteByDate(LocalDateTime date) {
		noteList.deleteByDate(date);
	}

	public List showLastNotes() {
		return noteList.showLastNotes();
	}
}
