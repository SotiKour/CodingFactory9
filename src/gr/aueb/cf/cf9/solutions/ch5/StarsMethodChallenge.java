package gr.aueb.cf.cf9.solutions.ch5;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει ένα μενού με 6 επιλογές με ποια μορφή θα εμφανίζονται τα
 * αστεράκια.
 */

public class StarsMethodChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 6;
        int stars = 0;
        int choice = 0;

        while (true) {
            printMenu();
            choice = scanner.nextInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος!");
                break;
            }

            System.out.println("Διάλεξε πόσα αστεράκια θες να εκτυπωθούν");
            stars = scanner.nextInt();

            switch (choice) {
                case 1 -> printHorizontalStars(stars);
                case 2 -> printVerticalStars(stars);
                case 3 -> printRowStars(stars);
                case 4 -> printRowStarsUpward(stars);
                case 5 -> printRowStarsDownward(stars);
                default -> System.out.println("Not valid!");
            };
            System.out.println();
        }
    }


    public static void printMenu() {
        System.out.println("Διάλεξε μία από τις παρακάτω επιλογές!");
        System.out.println("1. Οριζόντια!");
        System.out.println("2. Κάθετα!");
        System.out.println("3. n γραμμές με n αστεράκια ");
        System.out.println("4. n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void printHorizontalStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    public static void printVerticalStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.println("*");
        }
    }

    public static void printRowStars(int stars) {
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars; j++) {
                printHorizontalStars(1);
            }
            System.out.println();
        }
    }

    public static void printRowStarsUpward(int stars) {
        for (int i = 1; i <= stars; i++) {
            printHorizontalStars(i);
            System.out.println();
        }
    }

    public static void printRowStarsDownward(int stars) {
        for (int i = 0; i < stars; i++) {
            printHorizontalStars((stars - i));
            System.out.println();
        }
    }

}
