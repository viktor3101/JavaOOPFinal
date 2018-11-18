package Vihu.RunnerBinaryIO;

import Vihu.User;
import Vihu.Users;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestRunnerIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Users users = new Users();

		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("src/Vihu/RunnerBinaryIO/users.txt"));
			int length = in.readInt();
			for (int i = 0; i < length; i++) {
				users.register((User) in.readObject());
			}
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Sorry something went wrong ");
			ex.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


		User user = users.logIn();//I will log in Bob here
		user.changePass("pas3");//I will set the password bob2018
		user.changeUname("Bob");//I will set the username Bobee
		List s = user.showLastNotes();// here will return 1 note
		System.out.println("Array of notes:  " + Arrays.toString(s.toArray()));
		user = users.logOut(user);
		System.out.println();

		user = users.logIn();//I will log in Bob again with new un and pas and delete him
		users.deleteUser(user);
		user = users.logOut(user);
		System.out.println();

		user = users.logIn();//Now i`ll logIn as Paul
		List s1 = user.showLastNotes();//Here will return only 4 notes
		System.out.println(Arrays.toString(s1.toArray()));
		System.out.println("Input Date of message you wanna delete:");
		LocalDateTime date = LocalDateTime.parse(sc.next());
		user.deleteByDate(date);
		List s2 = user.showLastNotes();
		System.out.println(Arrays.toString(s2.toArray()));
		user = users.logOut(user);
	}
}
