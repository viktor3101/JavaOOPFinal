package Vihu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class NotesArray {
    private final ArrayList<Note> notes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    void addNote() {
        System.out.println("input your note: ");
        String tempNote = sc.nextLine();
        LocalDate tempDate = LocalDate.now();
        System.out.println("input your feelings: ");
        String tempFeelings = sc.nextLine();
        Note note = new Note(tempNote, tempDate, tempFeelings);
        notes.add(note);
    }

    String dateSearcher(LocalDate date) {
        String tempString = "|" + date;
        int i = 1;
        for (Note note : notes) {
            if (date == note.date) {
                tempString += "|" + i + "| " + note.note + "\n|   " + note.feelings;
                i++;
            }
        }
        if (tempString.equals("|" + date)) {
            return "no notes were found";
        } else {
            return tempString;
        }
    }

    String lastFourNotes() {
        int temp = notes.size();
        String tempStr = "";
        if (temp >= 4) {
            for (int i = temp; i > temp - 4; i--) {
                tempStr += notes.get(temp).toString() + "\n";
            }
        } else {
            for (Note note : notes) {
                tempStr += note.toString() + "\n";
            }
        }
        return tempStr;
    }
}
