package gr.aueb.cf.cf9.review.junior_level;

/**
 * Οι μεταβλητές a, m δεν είναι καλά ονόματα
 * Ο κώδικας θα μπορούσε να είναι μέθοδος
 * Δεν έχει documentation
 * Δεν υπάρχει έλεγχος για κενό array
 * Δεν έχει δομή
 * Δεν έχει SoC
 */


public class ArrayMax {

    public static void main(String[] args) {
        int m = 0;
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++){
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
