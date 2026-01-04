package gr.aueb.cf.cf9.ch2;
import java.util.Scanner;

/**
 * Ο χρήστης δίνει το βάρος σε κιλά (ακέραιος)
 * Και το πρόγραμμα επιστρέφει το βάρος σε γραμμάρια,
 * όπου 1 κιλό είναι ίσο με 1.000 γραμμάρια
 * Για παράδειγμα 5 κιλά είναι ίσο 5.000 γρ
 */

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOS_TO_GRAM = 1000;
        int inputWeightInKilograms = 0;
        int weightToGrams = 0;

        System.out.println("Παρακαλώ δώστε το βάρος σας σε κιλά!");
        inputWeightInKilograms = scanner.nextInt();
        weightToGrams = inputWeightInKilograms * KILOS_TO_GRAM;

        System.out.printf("Το βάρος σου σε κιλά είναι: %d Kg!\nΤο βάρος σου σε γραμμάρια είναι: %,d gr!\n", inputWeightInKilograms, weightToGrams);
    }
}
