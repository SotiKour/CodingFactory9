package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *  Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μια θερμοκρασία.
 *  Το πρόγραμμα υπολογίζει αν η θερμοκρασία <0 τότε μια μεταβλητή γίνεται
 *  true. Αλλιώς γίνετε false
 */

public class TemperatureApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        //Εισαγωγή Δεδομένων
        System.out.println("Please insert a temperature!");
        temperature = scanner.nextInt();

        //Επεξεργασία Δεδομένων

        isTempBelowZero = temperature < 0;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("The temperature is below zero: " + isTempBelowZero);

    }
}
