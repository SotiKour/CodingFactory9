package gr.aueb.cf.cf9.solutions.ch5;

import java.util.Scanner;

/**
 * Το πρόγραμμα θα δέχεται έναν αριθμό double που θα αντιπροσωπεύει βαθμούς Κελσίου
 * και θα επιστρέφει τους βαθμούς σε Φαρενάιτ. Η μετατροπή θα γίνεται μέσα σε μέθοδο.
 */

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        System.out.println("Παρακαλώ δώστε μια θερμοκρασία σε βαθμούς Κελσίου");
        celsius = scanner.nextDouble();

        fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("Η %.1f βαθμοί Κελσίου είναι %.1f βαθμοί Fahrenheit!", celsius, fahrenheit);

    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
}
