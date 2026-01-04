package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Κρυπτογράφηση με μετατροπή των χαρακτήρων σε ακεραίους.
 */

public class CryptographyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String str = "Coding Factory ";
        String newStr = " ";
        int key = 0;


        System.out.println("Please press 1 for cipher or 2 for decipher!");
        choice = scanner.nextInt();



        if (choice == 1){
            System.out.println("please enter the secret key!");
            key = scanner.nextInt();

            newStr = cipher(str, key);
            System.out.println("The cipher word is: " + newStr);

        } else if (choice == 2) {
            System.out.println("please enter the secret key!");
            key = scanner.nextInt();
            newStr = decipher(str, key);
            System.out.println("The decipher word is: " + newStr);

        }


    }

    public static String cipher(String s, int key){
        int prevCipher;
        int cipher;
        StringBuilder cipherArray = new StringBuilder();

        prevCipher = s.charAt(0);
        cipherArray.append(prevCipher);
        cipherArray.append(" ");

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == '#'){
                cipherArray.append("-1");
                break;
            }
            cipher = (s.charAt(i) + prevCipher) % key;
            cipherArray.append(cipher);
            cipherArray.append(" ");
            prevCipher = cipher;
        }
        return cipherArray.toString();
    }

    public static String decipher(String s, int key){
        StringBuilder decipherArray = new StringBuilder();
        String[] tokens = s.split(" ");
        char decipher;
        int cipher;

        int prevCipher = Integer.parseInt(tokens[0]);
        decipher = (char) prevCipher;
        decipherArray.append(decipher);

        for (int i = 1; i < tokens.length; i++){
            if (tokens[i].equals("-1")){
                decipherArray.append("#");
                break;
            }
            cipher = Integer.parseInt(tokens[i]);
            decipher = (char) ((cipher - prevCipher + key) % key);
            decipherArray.append(decipher);
            prevCipher = cipher;
        }
        return decipherArray.toString();

    }



}
