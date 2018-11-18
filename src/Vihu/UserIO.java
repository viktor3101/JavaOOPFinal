package Vihu;

import java.util.Scanner;

public class UserIO {
	private static Scanner sc = new Scanner(System.in);

	public static String pas() {
		System.out.print("Input your password: ");
		return sc.next();
	}

	public static void pasChange(String s) {
		System.out.print(s + ", you are changing your password\n");
	}

	public static void unChange(String s) {
		System.out.print(s + ", you are changing your username\n");
	}

	public static String un() {
		System.out.print("Input your username: ");
		return sc.next();
	}

	public static void loginStart() {
		System.out.println("*--LOGINING!--*");

	}

	private static void invalidValue() {
		System.out.println("Invalid value");
	}

	public static void invalidPath(){
		System.out.println("invalid file path");
	}

	public static String askSorting() {
		System.out.println("Newest first?");
		return sc.next();
	}

	public static int askFiltering() {
		System.out.println("What feeling will you wanna filter by?" +
				"\n1 == GOOD" +
				"\n2 == PERFECT" +
				"\n3 == THE_BEST" +
				"\n4 == SOSO" +
				"\n5 == CRAZY"
		);
		int temp = sc.nextInt();
		if (temp > 5 || temp < 1) {
			invalidValue();
			temp = 0;
		}
		return temp;
	}

	private static int feelingAskingForAddingNewNote(){
		System.out.println("How do you feel now?" +
				"\n1 == GOOD" +
				"\n2 == PERFECT" +
				"\n3 == THE_BEST" +
				"\n4 == SOSO" +
				"\n5 == CRAZY"
		);
		int temp = sc.nextInt();
		if (temp > 5 || temp < 1) {
			invalidValue();
			temp = 0;
		}
		return temp;
	}

	public static Feeling feelingsFilter(){
		int temp = UserIO.feelingAskingForAddingNewNote();
		switch(temp){
			case 1: return Feeling.GOOD;
			case 2: return Feeling.PERFECT;
			case 3: return Feeling.THE_BEST;
			case 4: return Feeling.SOSO;
			case 5: return Feeling.SOSO;
			default: return Feeling.NO_FEELING;
		}
	}

	public static void logining(User user) {
		System.out.println("You are now logged in as " + user.getUname() + ". Have fun! :)");
	}

	public static void logingOut(User user) {
		System.out.println("You have logged out " + user.getUname() + ". Have fun, bye! :)");
	}

	public static void deleting(User user) {
		System.out.println("Account " + user.getUname() + " will be deleted.");
	}
}
