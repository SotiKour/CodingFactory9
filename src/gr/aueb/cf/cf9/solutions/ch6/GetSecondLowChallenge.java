package gr.aueb.cf.cf9.solutions.ch6;

/**
 * Ο κώδικας βρίσκει το 2ο μικρότερο στοιχείου του πίνακα.
 * Το στοιχείο δηλαδή που βρίσκει το αμέσως μεγαλύτερο στοιχείου από το ελάχιστο
 */

public class GetSecondLowChallenge {

    public static void main(String[] args) {

        int [] arr = { 12 , 18, 23, 64};


        System.out.println(getSecondLowest(arr, 1,3));

    }

    /**
     * Βρίσκει τη θέση του δεύτερου ελάχιστου στοιχείου του πίνακα
     *
     * @param arr ο πίνακας ακεραίων στον οποίο θα γίνει η αναζήτηση
     * @param low ο κατώτερος δείκτης του εύρους αναζήτησης (συμπεριλαμβανομένου)
     * @param high ο ανώτερος δείκτης του εύρους αναζήτησης (συμπεριλαμβανομένου)
     * @return η θέση (δείκτης) του δεύτερου ελάχιστου στοιχείου στο εύρος [low, high],
     *         ή -1 αν ο πίνακας είναι null, κενός ή οι δείκτες είναι άκυροι
     */



    public static int getSecondLowest(int[] arr, int low, int high){
        if (arr == null || arr.length == 0) return -1;
        if (low < 0 || high >= arr.length || low > high) return -1;
        if (high - low < 1) return -1;

        int minPosition = low;
        int secondMinPosition = -1;
        int minValue = arr[minPosition];
        int secondMinValue = Integer.MAX_VALUE;

        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                secondMinValue = minValue;
                secondMinPosition = minPosition;

                minValue = arr[i];
                minPosition = i;
            } else if (arr[i] < secondMinValue) {
                secondMinValue = arr[i];
                secondMinPosition = i;
            }
        }
        return secondMinPosition;
    }
}
