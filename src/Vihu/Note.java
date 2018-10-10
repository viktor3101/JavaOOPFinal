package Vihu;

import java.time.LocalDate;

public class Note {
    /**
     * 1. нотатка:
     * - текст;
     * - дата;
     * - враження;
     **/
    public final String note;
    public final LocalDate date;
    public final String feelings;

    public Note(String note, LocalDate date, String feelings) {
        this.note = note;
        this.date = date;
        this.feelings = feelings;
    }

    public String toString() {
        return "| " + date + "\n| " + note + "\n| " + feelings;
    }
}
