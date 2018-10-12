package Vihu;

import java.time.LocalDateTime;

public class Note {

    private final String note;
    private final LocalDateTime date;
    private final String feelings;

    public Note(String note, LocalDateTime date, String feelings) {
        this.note = note;
        this.date = date;
        this.feelings = feelings;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getFeelings() {
        return feelings;
    }

    public String toString() {
        return "| " + date + "\n| " + note + "\n| feelings: " + feelings;
    }
}
