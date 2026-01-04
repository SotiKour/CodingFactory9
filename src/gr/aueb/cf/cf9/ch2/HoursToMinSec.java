package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculate Hours to minutes and Seconds
 * for given number of Hours
 */

public class HoursToMinSec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int HOURS_TO_MIN = 60;
        final int HOURS_TO_SEC = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Παρακαλώ δώστε το χρόνο σε ώρες");
        hours = scanner.nextInt();

        minutes = hours * HOURS_TO_MIN;
        seconds = hours * HOURS_TO_SEC;

        System.out.printf(Locale.US, "Οι ώρες είναι %d λεπτά!\n", minutes);
        System.out.printf(Locale.forLanguageTag("el"), "Οι %d ώρες είναι %,d δευτερόλεπτα!\n", hours, seconds);
    }
}
