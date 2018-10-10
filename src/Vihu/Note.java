package Vihu;

import java.time.LocalDate;

public class Note {
    /**
     * 1. нотатка:
     * - текст;
     * - дата;
     * - враження;
     **/
    final String note;
    final LocalDate date;
    final String feelings;

    Note(String note, LocalDate date, String feelings) {
        this.note = note;
        this.date = date;
        this.feelings = feelings;
    }

    public String toString() {
        return "| " + date + "\n| " + note + "\n| " + feelings;
    }
}
