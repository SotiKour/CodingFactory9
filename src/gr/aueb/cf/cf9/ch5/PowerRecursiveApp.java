package gr.aueb.cf.cf9.ch5;

/**
 * Το πρόγραμμα υπολογίζει τη δύναμη ενός ακεραίου μέσω επαναληπτικής μεθόδου.
 *
 */

public class PowerRecursiveApp {

    public static void main(String[] args) {
        int result = 0;

        result = pow(2, 2);

        System.out.println("Result = " + result);

    }

    public static int pow(int base, int power){
        return power == 0 ? 1 : base * pow(base, power - 1);
    }
}
