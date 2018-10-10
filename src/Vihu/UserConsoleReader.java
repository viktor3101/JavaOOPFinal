package Vihu;

import java.util.Scanner;

class UserConsoleReader {
    private static Scanner scanner = new Scanner(System.in);

    static User readUser(long id) {
        System.out.print("Input username: ");
        String tempUN = scanner.next();
        System.out.print("Input password: ");
        String tempPass = scanner.next();
        return new User(id, tempUN, tempPass);
    }

    static String username() {
        System.out.println("input username: ");
        return scanner.next();
    }

    static String password() {
        System.out.println("input username: ");
        return scanner.next();
    }

    static long userId(){
        System.out.print("Input id of user, you wanna delete: ");
        return scanner.nextLong();
    }

    static String changeInfo() {
        System.out.println("What will you wanna change?? (username/password)");
        return scanner.next();
    }
}
