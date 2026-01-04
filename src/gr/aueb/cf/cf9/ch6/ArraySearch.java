package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα.
 */

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {11, 22, 31, 40, 50, 61, 70, 18, 18, 143};
        int [] arr2 = null;
        int value = 0;
        int position = 0;

        System.out.println("Please enter a value to search!");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1){
            System.out.println("Value not found!");
        }

        System.out.println("Value " + value + " found at position " +(position + 1));

    }

    /**
     * Επιστρέφει τη θέση του πρώτου στοιχείου του πίνακα που ισούται με τη τιμή
     * αναζήτησης (value). Αν δεν υπάρχει το στοιχείο επιστρέφει -1.
     * @param arr   o input Πίνακας
     * @param value  η τιμή αναζήτησης
     * @return  το Position του πίνακα που βρέθηκε
     *          το στοιχείο, αλλιώς -1
     */

    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;

    }
}
