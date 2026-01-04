package gr.aueb.cf.cf9.solutions.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης επιλέγει επαναληπτικά μία από της διαθέσιμες επιλογές από
 * ένα μενού. Για τις επιλογές 1-4 το πρόγραμμα θα εμφανίζει στην κονσόλα
 * feedback. Αν ο χρήστης επιλέξει την επιλογή 5 θα τερματίζει το πρόγραμμα.
 * Επίσης, θα πρέπει να γίνεται έλεγχος αν ο χρήστης δώσει τιμή <1 ή >5.
 */

public class ChoicesApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(true) {
            System.out.println("Παρακαλώ διάλεξε μία από τις επιλογές: ");
            System.out.println("1. Εισαγωγή.");
            System.out.println("2. Διαγραφή.");
            System.out.println("3. Ενημέρωση.");
            System.out.println("4. Αναζήτηση.");
            System.out.println("5. Έξοδος.");
            choice = scanner.nextInt();


            if (choice < 1){
                System.out.println("Λάθος Επιλογή. Επέλεξε μεταξύ 1 και 5");
            } else if (choice > 5){
                System.out.println("Λάθος Επιλογή. Επέλεξε μεταξύ 1 και 5");
            } else if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else {
                System.out.println("Επιλέξατε Έξοδος");
                break;
            }
        }
    }
}
