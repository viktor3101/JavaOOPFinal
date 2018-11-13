package Vihu;

import java.util.Scanner;

public class UserIO {
	static Scanner sc = new Scanner(System.in);

	static String pas() {
		System.out.print("Input your password: ");
		return sc.next();
	}

	public static void pasChange(String s) {
		System.out.print(s + ", you are changing your password\n");
	}

	public static void unChange(String s){
		System.out.print(s + ", you are changing your username\n");
	}
	static String un() {
		System.out.print("Input your username: ");
		return sc.next();
	}

	public static void loginStart() {
		System.out.println("*--LOGINING!--*");

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
