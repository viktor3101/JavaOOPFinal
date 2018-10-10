package Vihu;

import java.time.LocalDateTime;

public class Note {

    final String note;
    final LocalDateTime date;
    final String feelings;

    public Note(String note, LocalDateTime date, String feelings) {
        this.note = note;
        this.date = date;
        this.feelings = feelings;
    }

    public String toString() {
        return "| " + date + "\n| " + note + "\n| feelings: " + feelings;
    }
}
