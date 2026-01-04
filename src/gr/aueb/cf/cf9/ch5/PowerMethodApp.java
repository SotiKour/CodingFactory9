package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Το πρόγραμμα υπολογίζει τη δύναμη ενός ακεραίου μέσω μεθόδου.
 *
 */

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int base = 1;
        int power =1;

        System.out.println("Please give one number for base and one for power!");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.printf("The %d of %d is %d\n", power, base, result);

    }

    public static int pow(int base, int power) {
        int result = 1;

        for (int i = 0; i < power ;  i++){
            result *= base;
        }
        return result;

    }






}
