package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program calculates if a number is ever or not
 * @author SotiKour
 */

public class EvenApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner scanner = new Scanner(System.in);
        int num =- 0;
        boolean result = false;

        //Είσοδος δεδομένων, Validation και Data Binding
        System.out.println("Please enter a number!");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid Input. Please enter a number!");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //Επιχειρησιακή Λογική
        result = isEven(num);


        // Εκτύπωση του αποτελέσματος
        System.out.println("The number is Even: " + result);

    }

    /**
     * Check if a number is Even.
     * @param num   the number to check.
     * @return      true if the number is even, false otherwise.
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

}
