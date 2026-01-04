package gr.aueb.cf.cf9.solutions.ch4;

import java.util.Scanner;

/**
 * Το πρόγραμμα ζητάει από το χρήστη να εισάγει το πλήθος n και το πλήθος m.
 * Το πλήθος n αντιστοιχεί σε γραμμές και το m σε αστεράκια σε κάθε γραμμή.
 * Το πρόγραμμα τα εκτυπώνει τα αστεράκια.
 */

public class StarsChallenge13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lines = 0;
        int rows = 0;

        System.out.println("Παρακαλώ Διάλεξε πόσες γραμμές αστεράκια θες να εκτυπωθούν και πόσα αστεράκια σε κάθε γραμμή!");
        lines = scanner.nextInt();
        rows = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

