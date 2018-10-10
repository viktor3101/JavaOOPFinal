package Vihu;

import java.util.Scanner;

public class User{
    public final long id;
    public static String username;
    public static String password;

    private static final Scanner scanner = new Scanner(System.in);

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public static void changeUser() {
        System.out.println("What will you wanna change?? (username/password)");
        String tempStr = scanner.next();
        if (tempStr.equals("username")) {
            username = scanner.next();
        }

        if (tempStr.equals("password")) {
            password = scanner.next();
        } else {
            System.out.println("wrong info");
        }
    }
}
