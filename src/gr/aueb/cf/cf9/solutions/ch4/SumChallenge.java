package gr.aueb.cf.cf9.solutions.ch4;

/**
 * Το πρόγραμμα βρίσκει και εκτυπώνει στο κονσόλα το άθροισμα ων αριθμών από το 1 έως το 50 με τη χρήση for.
 *
 */

public class SumChallenge {

    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 50; number++) {
            sum += number;
        }
        System.out.println("Sum 1-50 = " + sum);
    }
}
