package Vihu;

import java.time.LocalDateTime;
import java.util.Scanner;

import static Vihu.UserConsoleReader.*;

public class User{
    final long id;
    String username;
    String password;
    private final NotesList notes = new NotesList();

    private static final Scanner scanner = new Scanner(System.in);

    User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void changeUser() {
       String tempStr = changeInfo();
        if (tempStr.equals("username")) {
            username = scanner.next();
        }

        if (tempStr.equals("password")) {
            password = scanner.next();
        } else {
            System.out.println("wrong info");
        }
    }

    public void arrayAddNote(){
        notes.addNote();
    }
    public void arrayDateSearch(){
        notes.findByDate(LocalDateTime.now());
    }
    public void arrayLastFour(){
        int count =4;
        notes.lastFourNotes(count);
    }
}
