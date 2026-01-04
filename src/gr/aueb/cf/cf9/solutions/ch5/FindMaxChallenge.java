package gr.aueb.cf.cf9.solutions.ch5;

import java.util.Scanner;

/**
 *  Το πρόγραμμα ζητάει 3 αριθμούς από το χρήστη και βρίσκει το μεγαλύτερο.
 *
 */

public class FindMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int maxNumber = 0;

        System.out.println("Please enter 3 numbers to find max!");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        maxNumber = findMax(number1, number2, number3);

        System.out.printf("The Max number of %d, %d, %d is %d\n", number1, number2, number3, maxNumber);
    }

    /**
     * Η μέθοδος δέχεται 3 ακεραίους αριθμούς και επιστρέψει με τη βοήθεια της math το μεγαλύτερο.
     * @param number1   πρώτος αριθμός
     * @param number2   δεύτερος αριθμός
     * @param number3   τρίτος αριθμός
     * @return          επιστρέφεται ο μέγιστος
     */
    public static int findMax(int number1, int number2, int number3){
        int maxNumber = 0;
        maxNumber = Math.max(number1, number2);
        return Math.max(maxNumber, number3);
    }
}
