package Vihu;

import java.util.ArrayList;
import java.util.Arrays;

import static Vihu.UserConsoleReader.*;


public class UsersList {
    private static ArrayList<User> users = new ArrayList<>();
    private static long id = 1L;

    public void addUser() {
        users.add(readUser(id));
        id++;
    }

    public void addUser(String uName, String pass) {
        users.add(new User(id, uName, pass));
        id++;
    }

    public void deleteUser(long tempId) {
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

    public User loginUser() {
        User tempUser = null;
        while (tempUser == null) {
            String tempUN = username();
            String tempPass = password();
            for (User user : users) {
                if (user.username.equals(tempUN) && user.password.equals(tempPass)) {
                    tempUser = user;
                }
            }
        }
        return tempUser;
    }

    public String showUser() {
        String[] usersArray = new String[users.size()];
        int i = 0;
        for (User user : users) {
            usersArray[i]=user.username;
            i++;
        }
        return Arrays.toString(usersArray);
    }

    public String logoutUser() {
        return "you have logged out";
    }
}
