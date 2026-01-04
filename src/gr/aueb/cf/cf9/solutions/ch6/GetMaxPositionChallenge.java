package gr.aueb.cf.cf9.solutions.ch6;

/**
 * Το πρόγραμμα βρίσκει το μέγιστο ενός πίνακα και επιστρέφει τη θέση του στοιχείου.
 */

public class GetMaxPositionChallenge {

    public static void main(String[] args) {
        int [] arr = { 12 , 18, 23, 64};


        System.out.println(getMaxPosition(arr, 1, 2));


    }
    /**
     * Βρίσκει τη θέση του μέγιστου στοιχείου σε ένα καθορισμένο εύρος πίνακα.
     *
     * @param arr ο πίνακας ακεραίων στον οποίο θα γίνει η αναζήτηση
     * @param low ο κατώτερος δείκτης του εύρους αναζήτησης (συμπεριλαμβανομένου)
     * @param high ο ανώτερος δείκτης του εύρους αναζήτησης (συμπεριλαμβανομένου)
     * @return η θέση (δείκτης) του μέγιστου στοιχείου στο εύρος [low, high],
     *         ή -1 αν ο πίνακας είναι null, κενός ή οι δείκτες είναι άκυροι
     */


     public static int getMaxPosition(int[] arr, int low, int high){

         // Έλεγχος για null ή κενό πίνακα
        if (arr == null || arr.length == 0) return -1;

        // Έλεγχος για άκυρους δείκτες
        if (low < 0 || high >= arr.length || low > high) return -1;

         // Αρχικοποίηση με το πρώτο στοιχείο του εύρους
        int maxPosition = low;
        int maxValue = arr[maxPosition];


         // Αναζήτηση μόνο στο καθορισμένο εύρος [low, high]
        for (int i = low; i <= high; i++){
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
     }
}
