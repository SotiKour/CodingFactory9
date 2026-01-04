package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός ή όχι.
 * Συμμετρικός είναι ένας πίνακας αν διαβάζετε το ίδιο από την αρχή και το τέλος
 * Για παράδειγμα [1, 2, 3, 3, 2, 1] και
 * [1, 2, 3, 2, 1]
 */

public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 4, 5};

        System.out.println(isArraySymmetric(arr1));
        System.out.println(isArraySymmetric(arr2));

    }

    public static boolean isArraySymmetric(int[] arr){

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
