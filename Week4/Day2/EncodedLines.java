import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EncodedLines {
    public static void main(String[] args) {

        try {
            encodedLines("encoded-lines.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void encodedLines(String file) throws IOException {

        Path filepath = Paths.get(file);
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(filepath));

        ArrayList<Character> alphabet = new ArrayList<>();


        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);

        }

        for (int i = 0; i < content.size(); i++) {
            String line0 = content.get(i);
            String line = line0.toLowerCase();


            for (int j = 0; j < line.length(); j++) {

                if ((line.charAt(j)) == '[') {
                    System.out.print('z');

                } else if ((line.charAt(j)) == '/') {
                    System.out.print('.');

                } else if ((line.charAt(j)) == '(') {
                    System.out.print('\'');
                } else if ((line.charAt(j)) == '.') {
                    System.out.print('-');
                } else if ((line.charAt(j)) == '"') {
                    System.out.print('!');

                    // }else if(String.valueOf(line.charAt(j)) == " ") {
                    //    System.out.print(" ");

                } else if ((alphabet.indexOf(line.charAt(j))) == -1) {
                    System.out.print(" ");
                } else {
                    int ind = (alphabet.indexOf(line.charAt(j))) - 1;
                    System.out.print(alphabet.get(ind));
                }
            }

            System.out.println(" ");
        }
    }
}


// Create a method that decrypts encoded-lines.txt
