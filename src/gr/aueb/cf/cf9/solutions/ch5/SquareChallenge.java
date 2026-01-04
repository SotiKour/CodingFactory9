package gr.aueb.cf.cf9.solutions.ch5;

import java.util.Scanner;

/**
 * Το πρόγραμμα περιλαμβάνει μία μέθοδο που υπολογίζει το τετράγωνο ενός αριθμού που εισάγει ο χρήστης
 *
 */

public class SquareChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό!");
        number = scanner.nextInt();

        result = square(number);

        System.out.printf("Το τετράγωνο του %d αριθμού είναι %d", number, result);
    }
    /**
     * Η μέθοδος παίρνει σαν είσοδο έναν αριθμό και επιστρέφει το τετράγωνο του
     */

    public static int square(int number){
        return number * number;
    }
}
