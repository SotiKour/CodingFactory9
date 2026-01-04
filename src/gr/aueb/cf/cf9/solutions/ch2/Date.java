package gr.aueb.cf.cf9.solutions.ch2;

import java.util.Scanner;

/**
 * Το πρόγραμμα θα ζητάει από το χρήστη 3 αριθμούς που θα αναπαριστάνουν την ημερομηνία και θα
 * την εμφανίσει σε μορφή ΗΗ/ΜΜ/ΕΕ (ημέρα/μήνας/έτος)
 */

public class Date {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int date = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter three numbers");
        date = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        System.out.printf("%02d/%02d/%02d%n", date, month, year);
    }
}
