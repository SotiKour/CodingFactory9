package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10 numbers from 1 to 10.
 * Product of 10 numbers from 1 to 10.
 */

public class Sum10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;
        int j = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        while (i <= 10) {
            mul *= j;
            j++;
        }


        System.out.println("Sum: " + sum);
    }
}
