package gr.aueb.cf.cf9.solutions.ch4;

/**
 * Το πρόγραμμα εμφανίζει μια πυραμίδα από αστεράκια με 4 σειρές.
 *
 */

public class StarPyramidChallenge {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int j = 3; j >= i; j--){
                System.out.print(' ');
                }
            for (int k = 1; k <= (2 * i -1); k += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
