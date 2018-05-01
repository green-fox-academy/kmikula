import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReversedLines {

    public static void main(String[] args) {

        try {
            reversedLines("reversed-lines.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reversedLines(String file) throws IOException {

        Path filepath = Paths.get(file);

        ArrayList<String> content = new ArrayList<>(Files.readAllLines(filepath));

        for (int i = 0; i < content.size(); i++) {
            String line = content.get(i);

            for (int j = line.length() - 1; j >= 0; j--) {
                System.out.print(line.charAt(j));
            }
            System.out.println(" ");
        }

    }
}

// Create a method that decrypts reversed-lines.txt
