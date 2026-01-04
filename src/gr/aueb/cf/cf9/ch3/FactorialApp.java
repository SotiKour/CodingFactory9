package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate Factorial of a Number.
 * n! = 1 * 2 * 3 * 4 * ......* n
 * For instance: 5! = 1 * 2 * 3 * 4 * 5 = 120
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int factrorial = 1;
        int i = 1;

        System.out.println("Please give me the number you want to found Factorial!");
        number = scanner.nextInt();

        while ( i <= number) {
            factrorial *= i;
            i++;
        }

        System.out.printf("Factorial %d = %d%n", number, factrorial);
    }
}
