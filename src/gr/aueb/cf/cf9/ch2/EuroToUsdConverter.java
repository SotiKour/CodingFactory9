package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη ένα ποσό (ακέραιος) σε ευρώ και το μετατρέπει σε δολάρια
 * ΗΠΑ με βάση μια ισοτιμία. Για παράδειγμα, αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 ευρώ = 99 USA cents,
 * τότε τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί σε 99 USA dollars και 0 USA cents
 */

public class EuroToUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERSION_RATE = 99;
        int inputEuros = 0;
        int usaDollars = 0;
        int totalUsaCents = 0;
        int remainingCents = 0;

        //Data Input
        System.out.println("Please give the amount in euro!");
        inputEuros = scanner.nextInt();

        //Data processing - Expressions
        totalUsaCents = inputEuros * EURO_TO_USD_CONVERSION_RATE;
        usaDollars = totalUsaCents / 100;
        remainingCents = totalUsaCents % 100;

        //Data Output
        System.out.printf("The %d euro are %d Dollars and %d Cents!\n",inputEuros , usaDollars, remainingCents);




    }



}
