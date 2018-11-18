package Vihu;

import java.io.*;
import java.time.LocalDateTime;

public class TestRunnerOut {
	public static void main(String[] args) {
		Users users = new Users();
		users.register(new User("Paul", "pas1", 1L));//id 1
		users.register(new User("Katy", "pas2", 2L));//id 2
		users.register(new User("Bob", "pas3", 3L));//id 3


		users.getUser("Paul").addNote(new Note("Today i had the best day ever:))", LocalDateTime.now().minusMonths(1), Feeling.THE_BEST));
		users.getUser("Paul").addNote(new Note("Feeling bad", LocalDateTime.now().minusDays(5), Feeling.SOSO));
		users.getUser("Paul").addNote(new Note("No comments", LocalDateTime.now().minusDays(2), Feeling.GOOD));
		users.getUser("Paul").addNote(new Note("I am stupid", LocalDateTime.now().minusDays(1), Feeling.PERFECT));
		users.getUser("Paul").addNote(new Note("i am married", LocalDateTime.now(), Feeling.THE_BEST));

		users.getUser("Katy").addNote(new Note("he will marry me", LocalDateTime.now().minusMonths(1), Feeling.THE_BEST));
		users.getUser("Katy").addNote(new Note("he really wanna me be his wife", LocalDateTime.now().minusDays(7), Feeling.CRAZY));
		users.getUser("Katy").addNote(new Note("i am married", LocalDateTime.now(), Feeling.THE_BEST));

		users.getUser("Bob").addNote(new Note("feel HAPPY! my Katy is wife now", LocalDateTime.now(), Feeling.THE_BEST));

		//ObjectOutputStream out = null;

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.txt"));
			int length = users.size();
			out.writeInt(length);
			for (int i = 0; i < users.size(); i++) {
				out.writeObject(users.get(i));
			}
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		users = new Users();

		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("users.txt"));
			int length = in.readInt();
			for (int i=0;i<length;i++){
				users.register((User)in.readObject());
			}
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Viktor Invalid");
			ex.printStackTrace();
		}
        in.close();
	}
}
