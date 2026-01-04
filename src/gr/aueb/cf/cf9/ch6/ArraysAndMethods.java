package gr.aueb.cf.cf9.ch6;

/**
 * Arrays and Methods
 * Demo of how we pass an array as a formal parameter.
 * and also how we return an array from a method
 */

public class ArraysAndMethods {

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        printArray(arr);
        printArray(arr, 0, arr.length);

        int[] arr5 = getArray5();



    }

    /**
     * print the contents of the array
     * assumption: high is exclusive.
     * @param arr   the input array.
     */
    public static void printArray(int[] arr){
        for (int item :  arr){
            System.out.println(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length){
            return;
        }

        if (low > high) {
            return;
        }

        for (int i = low; i < high; i++){
            System.out.println(arr[i] + " ");
        }

    }

    // return a new array with 5
    public static int[] getArray5() {
        return new int[5];
    }
}
