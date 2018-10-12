package Vihu;

import java.util.Scanner;

public class UserConsoleReader {
    private static Scanner scanner = new Scanner(System.in);

    public static User readUser(long id) {
        System.out.print("Input username: ");
        String tempUN = scanner.next();
        System.out.print("Input password: ");
        String tempPass = scanner.next();
        return new User(id, tempUN, tempPass);
    }

    public static String username() {
        System.out.println("input username: ");
        return scanner.next();
    }

    public static String password() {
        System.out.println("input password: ");
        return scanner.next();
    }

    public static long userId(){
        System.out.print("Input id of user, you wanna delete: ");
        return scanner.nextLong();
    }

    public static String changeInfo() {
        System.out.println("What will you wanna change?? (username/password)");
        return scanner.next();
    }
}
