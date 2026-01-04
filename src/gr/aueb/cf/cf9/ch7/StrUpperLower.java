package gr.aueb.cf.cf9.ch7;

/**
 * Μετατρέπει σε lowercase/Uppercase
 */

public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        boolean isEqual = s1.toUpperCase().equals((s2.toUpperCase()));
        boolean isEqual2 = s1.toLowerCase().equals((s2.toLowerCase()));

        System.out.println(isEqual);
        System.out.println(isEqual2);


    }
}
