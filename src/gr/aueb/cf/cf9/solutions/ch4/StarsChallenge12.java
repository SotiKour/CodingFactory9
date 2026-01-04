package gr.aueb.cf.cf9.solutions.ch4;

import java.util.Scanner;

/**
 * Το πρόγραμμα ζητάει από το χρήστη να εισάγει το πλήθος n.
 * Το πλήθος n αντιστοιχεί σε αστεράκια και το πρόγραμμα εκτυπώνει
 * τα αστεράκια σε κάθετη γραμμή.
 */

public class StarsChallenge12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Παρακαλώ Διάλεξε πόσα αστεράκια θες να εκτυπωθούν!");
        stars = scanner.nextInt();

        for (int i = 1; i <= stars; i++){
            System.out.println("*");
        }
    }
}