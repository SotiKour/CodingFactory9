package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Demo pf file Readers in the java.io Package.
 */

public class FileReadersJavaIo {

    public static void main(String[] args) {
        File file  = new File("C:/Users/sotik/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try{
            bufferedReader(file);


        } catch (IOException e) {
            System.out.println("Κάποιο λάθος συνέβη");
        }



    }

    //Scanner is useful for  reading primitives and types and Strings

    public static void fileReader(String file) throws IOException {
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) {
            int bytesRead = 0;
            while ((bytesRead = fr.read()) != -1) {
                System.out.println((char) bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedReader(File file) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))){
            String line;

            while((line = br.readLine()) != null){      //while not EOF
                System.out.println(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
