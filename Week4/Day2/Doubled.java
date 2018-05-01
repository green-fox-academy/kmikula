import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Doubled {

    public static void main(String[] args) {

        try {
            decryptDuplicate("duplicated-chars.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void decryptDuplicate(String filename) throws IOException {

        Path filepath = Paths.get(filename);

        ArrayList<String> content = new ArrayList<>(Files.readAllLines(filepath));

        //ArrayList<String> decryptedContent = new ArrayList<String>();

        String stringsInALine;

        //StringBuilder sb = new StringBuilder();

        for (int i = 0; i < content.size(); i++) {

            stringsInALine = content.get(i);

            for (int j = 0; j < stringsInALine.length(); j += 2) {

                System.out.print(stringsInALine.charAt(j));

                //sb.append( Character.toString(stringsInALine.charAt(j)));

                //decryptedContent.add(Character.toString(stringsInALine.charAt(j)));


            }
            System.out.println(" ");


        }
        // decryptedContent.add(String.valueOf(sb));


        //return decryptedContent;
    }

}


// Create a method that decrypts the duplicated-chars.txt
