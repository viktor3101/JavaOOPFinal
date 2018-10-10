package Vihu;

import java.util.ArrayList;

import static Vihu.UserConsoleReader.*;


public class UsersList {
    private static ArrayList<User> users = new ArrayList<>();
    private static long id = 0L;
    private static long currentUserId = 0L;

    public static void addUser() {
        users.add(readUser(id));
        id++;
    }

    public static void deleteUser() {
        long tempId = userId();
        User tempUser = null;
        while (tempUser == null) {
            for (User user : users) {
                if (user.id == tempId) {
                    tempUser = user;
                    break;
                }
            }
            if (tempUser == null) {
                tempId = userId();
            }
        }
        String pass = password();
        if (pass.equals(tempUser.password)) {
            System.out.println("your account will be deleted:)");
            users.remove(tempUser);
        }
    }

    public static void loginUser() {
        while (currentUserId == 0L) {
            String tempUN = username();
            String tempPass = password();
            for (User user : users) {
                if (user.username.equals(tempUN) && user.password.equals(tempPass)) {
                    currentUserId = user.id;
                }
            }
        }
    }

    public static void logoutUser() {
        currentUserId = 0L;
    }
}
