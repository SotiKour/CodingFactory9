package gr.aueb.cf.cf9.solutions.ch3;

import java.util.Scanner;

/**
 * Το πρόγραμμα ζητάει από το χρήστη να εισάγει ένα έτος. Το πρόγραμμα ελέγχει αν το έτος είναι δίσεκτο
 * και επιστρέφει στην κονσόλα το αποτέλεσμα.
 */

public class LeapYear {

    public static void main(String[] args) {

        //
        // Τμήμα 1: Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        //
        // Τμήμα 2: Εισαγωγή και επεξεργασία δεδομένων
        System.out.println("Please enter a Year to check if is Leap: ");
        year = scanner.nextInt();

        //
        // Τμήμα 3: Υπολογισμοί
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else if (year % 400 == 0){
                isLeap = true;
            }
        }

        //
        // Τμήμα 4: Εκτύπωση αποτελεσμάτων
        System.out.printf("The %d year is Leap: %b\n", year, isLeap);
    }
}
