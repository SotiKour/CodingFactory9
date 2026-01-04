package gr.aueb.cf.cf9.solutions.ch4;

import java.util.Scanner;

/**
 * Το πρόγραμμα ζητάει από το χρήστη να εισάγει το πλήθος n.
 * Το πλήθος n αντιστοιχεί σε γραμμές και η κάθε γραμμή θα εμφανίζει 1 λιγότερο αστεράκι από τη προηγούμενη.
 * Το πρόγραμμα θα εκτυπώνει π.χ. στη πρώτη σειρά 2 αστεράκια στη 2η 1 αστεράκι.
 */

public class StarsChallenge15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Παρακαλώ Διάλεξε πόσες γραμμές με αστεράκια θες να εκτυπωθούν!");
        stars = scanner.nextInt();

        for (int i = 1; i <= stars; i++) {
            for (int j = stars; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}