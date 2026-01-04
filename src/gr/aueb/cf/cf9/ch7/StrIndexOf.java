package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");                          //1
        System.out.println(positionOfo);
        int positionOfNexto = cf.indexOf("o", 2);       // 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o");
        System.out.println(positionOfLasto);

        System.out.println(getExtensions("Kalamata.txt"));
    }

    //Μέθοδος που να επιστρέφει την κατάληξη του ονόματος ενός αρχείου
    //Coding.txt
    public static String getExtensions(String fileName){
        return fileName.substring(fileName.lastIndexOf(".")+1);

    }
}
