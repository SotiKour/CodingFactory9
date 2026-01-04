package gr.aueb.cf.cf9.ch2;
/*
* Προσθέτει 2 ακεραίους και το αποτέλεσμα
* δημιουργεί υπερχείλιση (Overflow)
 */

public class OverflowApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το αποτέλεσμα είναι: %d\n", result);

    }
}
