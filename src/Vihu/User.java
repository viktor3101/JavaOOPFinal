package Vihu;

import java.time.LocalDateTime;
import java.util.Scanner;

import static Vihu.UserConsoleReader.*;

public class User {
    final long id;
    String username;
    String password;
    private final NotesList notes = new NotesList();

    private static final Scanner scanner = new Scanner(System.in);

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void changeUser() {
        String tempStr = changeInfo();
        if (tempStr.equals("username")) {
            this.username = scanner.next();
        } else {
            if (tempStr.equals("password")) {
                this.password = scanner.next();
            } else {
                System.out.println("wrong info");
            }
        }
    }

    public long seeMyId() {
        return id;
    }

    public void arrayAddNote() {
        notes.addNote();
    }

    public void arrayAddNote(String note, String feelings, LocalDateTime dateTime) {
        notes.addNote(note, feelings, dateTime);
    }

    public void arrayDateSearch() {
        notes.findByDate(LocalDateTime.now());
    }

    public String listLastNotes() {
        int count = 4;
        return notes.lastFourNotes(count);
    }
}
