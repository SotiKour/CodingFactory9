package gr.aueb.cf.cf9.ch7;

public class ReversedStrApp {

    public static void main(String[] args) {
        String str = "Athens University of Economics and Business";


    }

    public static String reversed(String str){
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reversed2(String str){
        return new StringBuilder(str).reverse().toString();

    }
}
