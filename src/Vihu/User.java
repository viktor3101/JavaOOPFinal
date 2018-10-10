package Vihu;

import java.time.LocalDate;
import java.util.Scanner;

public class User{
    final long id;
    String username;
    String password;
    private static NotesArray userNotes = new NotesArray();

    private static final Scanner scanner = new Scanner(System.in);

    User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void changeUser() {
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

    public static void arrayAddNote(){
        userNotes.addNote();
    }
    public static void arrayDateSearch(){
        userNotes.dateSearcher(LocalDate.now());
    }

    public static void arrayLastFour(){
        userNotes.lastFourNotes();
    }
}
