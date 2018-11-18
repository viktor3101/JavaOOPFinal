package Vihu.RunnerFileIO;

import Vihu.Feeling;
import Vihu.Note;
import Vihu.User;
import Vihu.Users;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class RunnerFileIO {
	public static void main(String[] args) {
		Users users = new Users();
		users.register(new User("Paul", "pas1", 1L));//id 1

		try {
			users.getUser("Paul").addNoteFromFile("input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List s = users.getUser("Paul").showLastNotes();
		System.out.println(Arrays.toString(s.toArray()));

		users.getUser("Paul").addNote(new Note("Today i had the best day ever:))", LocalDateTime.now().minusMonths(1), Feeling.THE_BEST));
		users.getUser("Paul").addNote(new Note("Feeling bad", LocalDateTime.now().minusDays(5),Feeling.SOSO));
		users.getUser("Paul").addNote(new Note("No comments", LocalDateTime.now().minusDays(2),Feeling.GOOD));

		s = users.getUser("Paul").showLastNotes();
		System.out.println(Arrays.toString(s.toArray()));

		users.getUser("Paul").writeNotesInFile();

	}
}
