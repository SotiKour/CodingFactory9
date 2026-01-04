package gr.aueb.cf.cf9.solutions.ch5;

import java.util.Scanner;

/**\
 * Το πρόγραμμα θια ζητάει έναν αριθμό από το χρήστη και θα επιστρέφει αν είναι πρώτος.
 * Ο έλεγχος θα γίνεται μέσα σε μέθοδο.
 */

public class IsPrimeChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean prime = false;
        int number = 0;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό!");
        number = scanner.nextInt();

        prime = isPrime(number);
        System.out.printf("The number is Prime: %s\n", prime);
    }

    /**
     * Η μέθοδος θα δέχεται έναν αριθμό ακέραιο και θα επιστρέφει αν ο αριθμός είναι πρώτος.
     * Πρώτος είναι ένας αριθμός που διαιρείτε μόνο με τον εαυτό του και τη μονάδα
     */
    public static boolean isPrime(int number) {
        int j = 0;
        for (int i = 1 ; i <= number; i++){
            if (number % i == 0){
               j++;
            }
            if (j > 2){
               return false;
            }
        }
        return true;
    }
}
