package Vihu;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NoteConsoleReader {
    private static Scanner scanner = new Scanner(System.in);

    public static Note readNote() {
        System.out.println("input your note: ");
        String tempNote = scanner.nextLine();
        LocalDateTime tempDate = LocalDateTime.now();
        System.out.println("input your feelings: ");
        String tempFeelings = scanner.nextLine();
        return new Note(tempNote, tempDate, tempFeelings);
    }

}
