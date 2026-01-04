package gr.aueb.cf.cf9.solutions.ch4;

import java.util.Scanner;

/**
 * Το πρόγραμμα θα δέχεται έναν αριθμό από το 1 έως το 7 και θα επιστρέφει την
 * το αντίστοιχο όνομα της ημέρας
 */

public class DaysChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        System.out.println("Please choose a number between 1 and 7! ");
        number = scanner.nextInt();

        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong choice. Please choose a number between 1 and 7!");
        }
    }
}
