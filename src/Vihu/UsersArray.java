package Vihu;

import java.util.ArrayList;
import java.util.Scanner;

public class UsersArray {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static long id = 0;

    public static void addUser() {
        System.out.print("Input username: ");
        String tempUN = scanner.next();
        System.out.print("Input password: ");
        String tempPass = scanner.next();
        User user = new User(id, tempUN, tempPass);
        id++;
        users.add(user);
    }

    public static void deleteUser() {
        System.out.print("Input id of user, you wanna delete: ");
        long tempid = scanner.nextLong();
        User tempUser = null;
        for (User user : users) {
            if (user.id == tempid) {
                tempUser = user;
                break;
            }
        }
        System.out.print("Input your password: ");
        String pass = scanner.next();
        if (pass.equals(tempUser.password)) {
            System.out.println("your account will be deleted:)");
            users.remove(tempUser);
        }
    }

    public static void loginUser() {
        System.out.println("input login: ");

    }

    public static void logoutUser() {

    }
}
