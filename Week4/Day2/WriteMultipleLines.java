import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {

    public static void main(String[] args) {

        Path filePath = Paths.get("Newfile.txt");

        try {
            writeLines(filePath, "rain", 5);
        } catch (Exception e) {
            System.out.println("Unable to write file: " + filePath);

        }

    }

    public static void writeLines(Path filePath, String textInput, int nrOfLines) throws IOException {

        ArrayList<String> content = new ArrayList<>();

        for (int row = 0; row < nrOfLines; row++) {

            content.add(textInput +"\n");

        }

        Files.write(filePath, content);

        System.out.println(Files.readAllLines(filePath));

    }

}


// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
