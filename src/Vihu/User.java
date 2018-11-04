package Vihu;

import java.time.LocalDateTime;
import java.util.Scanner;

import static Vihu.UserConsoleReader.*;

public class User {
    private final long id;
    private String username;
    private String password;
    private final NotesList notes = new NotesList();

    public String getUsername() {
        return username;
    }

    public long getId(){
        return id;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
            }
        }
    }

    public void addNote() {
        notes.addNote();
    }

    public void addNote(String note, String feelings, LocalDateTime dateTime) {
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
