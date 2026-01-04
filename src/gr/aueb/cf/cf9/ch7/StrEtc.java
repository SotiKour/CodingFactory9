package gr.aueb.cf.cf9.ch7;

public class StrEtc {

    public static void main(String[] args) {

        // traverse as array
        String s = "Coding Factory";

        for (char ch : s.toCharArray()){
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        // replace
        String firstName = "Maria-Helen";
        String simpleName = firstName.replace("-", " ");

        System.out.println(firstName);
        System.out.println(simpleName);

        //Concat
        String lastName = "Smith";
        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println(fullName);
        System.out.println(fullName2);


    }
}
