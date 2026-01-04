package gr.aueb.cf.cf9.solutions.ch4;

/**
 * Το πρόγραμμα εμφανίζει τους αριθμούς από το 1 μέχρι το 10 με αντίστροφη σειρά με τη χρήση for.
 *
 */

public class PrintNumberChallenge {

    public static void main(String[] args) {

        for (int number = 10; number >= 1; number--) {
            System.out.print(number);
        }
    }
}
