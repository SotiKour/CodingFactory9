package gr.aueb.cf.cf9.solutions.ch1;

/**
* Προσθέτει 2 ακεραίους και εμφανίζει το αποτέλεσμα στην κονσόλα.
 */

public class AddApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 500_000;
        int num2 = 10_000;
        int result;

        // Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των: " + num1 +" , " + num2 + " είναι: " + result);
        System.out.printf("Το άθροισμα των: %,d , %,d είναι: %,d\n", num1,num2,result);
    }
}
