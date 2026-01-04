package gr.aueb.cf.cf9.solutions.ch2;

import java.util.Scanner;

/**
 * Το πρόγραμμα μετατρέπει ακέραιες θερμοκρασίες Fahrenheit σε Celsius. Τη θερμοκρασία την εισάγει ο χρήστης.
 */

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperatureInFahrenheit = 0;
        int temperatureInCelsius = 0;

        // Εισαγωγή δεδομένων από τον χρήστη
        System.out.println("Please give me a temperature in Fahrenheit");
        temperatureInFahrenheit = scanner.nextInt();

        // Επεξεργασία - Υπολογισμός μετατροπής
        temperatureInCelsius = 5 * (temperatureInFahrenheit - 32) / 9;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The %d Fahrenheit is %d Celsius!%n", temperatureInFahrenheit, temperatureInCelsius);
    }
}
