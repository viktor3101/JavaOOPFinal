package Vihu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class NotesArray {
    public final ArrayList<Note> notes = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public void addNote() {
        System.out.println("input your note: ");
        String tempNote = sc.nextLine();
        LocalDate tempDate = LocalDate.now();
        System.out.println("input your feelings: ");
        String tempFeelings = sc.nextLine();
        Note note = new Note(tempNote, tempDate, tempFeelings);
        notes.add(note);
    }

    public String dateSearcher(LocalDate date) {
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

    public String lastFourNotes() {
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
