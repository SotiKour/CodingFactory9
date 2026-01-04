package gr.aueb.cf.cf9.ch6;

/**
 * Αναζήτηση ενός στοιχείου σε ταξινομημένο πίνακα.
 */

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {2, 3, 5, 6, 8, 9, 11};


    }

    public static int binarySearch(int[] arr, int value, int low, int high){
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) /2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low, mid - 1);
    }
}
