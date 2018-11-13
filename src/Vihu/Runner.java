package Vihu;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Users users = new Users();
		users.register(new User("Paul", "pas1",1L));//id 1
		users.register(new User("Katy", "pas2",2L));//id 2
		users.register(new User("Bob", "pas3",3L));//id 3


		users.getUser("Paul").addNote(new Note("Today i had the best day ever:))", LocalDateTime.now().minusMonths(1), Feeling.THE_BEST));
		users.getUser("Paul").addNote(new Note("Feeling bad", LocalDateTime.now().minusDays(5),Feeling.SOSO));
		users.getUser("Paul").addNote(new Note("No comments", LocalDateTime.now().minusDays(2),Feeling.GOOD));
		users.getUser("Paul").addNote(new Note("I am stupid", LocalDateTime.now().minusDays(1), Feeling.PERFECT));
		users.getUser("Paul").addNote(new Note("i am married", LocalDateTime.now(), Feeling.THE_BEST));

		users.getUser("Katy").addNote(new Note("he will marry me", LocalDateTime.now().minusMonths(1),Feeling.THE_BEST));
		users.getUser("Katy").addNote(new Note("he really wanna me be his wife", LocalDateTime.now().minusDays(7), Feeling.CRAZY));
		users.getUser("Katy").addNote(new Note("i am married", LocalDateTime.now(), Feeling.THE_BEST));

		users.getUser("Bob").addNote(new Note("feel HAPPY! my Katy is wife now", LocalDateTime.now(),Feeling.THE_BEST));


		Scanner sc = new Scanner(System.in);

		User user = users.logIn();//I will log in Bob here
		user.changePass("pas3");//I will set the password bob2018
		user.changeUname("Bob");//I will set the username Bobee
		List s = user.showLastNotes();// here will return 1 note
		System.out.println("Array of notes:  "+Arrays.toString(s.toArray()));
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
		user= users.logOut(user);


	}
}
/**
 * *--LOGINING!--*
 * Input your username: Bob
 * Input your password: pas3
 * You are now logged in as Bob. Have fun! :)
 * Bob, you are changing your password
 * Input your password: bob2018
 * Bob, you are changing your username
 * Input your username: Bobee
 * Array of notes:  [Note{note='feel HAPPY! my Katy is wife now', dateTime=2018-11-13T04:27:30.973362, feeling=THE_BEST}]
 * You have logged out Bobee. Have fun, bye! :)
 *
 * *--LOGINING!--*
 * Input your username: Bobee
 * Input your password: bob2018
 * You are now logged in as Bobee. Have fun! :)
 * Account Bobee will be deleted.
 * You have logged out Bobee. Have fun, bye! :)
 *
 * *--LOGINING!--*
 * Input your username: Paul
 * Input your password: pas1
 * You are now logged in as Paul. Have fun! :)
 * [Note{note='Feeling bad', dateTime=2018-11-08T04:27:30.973116, feeling=SOSO}, Note{note='No comments', dateTime=2018-11-11T04:27:30.973166, feeling=GOOD}, Note{note='I am stupid', dateTime=2018-11-12T04:27:30.973199, feeling=PERFECT}, Note{note='i am married', dateTime=2018-11-13T04:27:30.973221, feeling=THE_BEST}]
 * Input Date of message you wanna delete:
 * 2018-11-11T04:27:30.973166 //note{No comments} has been deleted
 * [Note{note='Today i had the best day ever:))', dateTime=2018-10-13T04:27:30.969520, feeling=THE_BEST}, Note{note='Feeling bad', dateTime=2018-11-08T04:27:30.973116, feeling=SOSO}, Note{note='I am stupid', dateTime=2018-11-12T04:27:30.973199, feeling=PERFECT}, Note{note='i am married', dateTime=2018-11-13T04:27:30.973221, feeling=THE_BEST}]
 * You have logged out Paul. Have fun, bye! :)
 **/