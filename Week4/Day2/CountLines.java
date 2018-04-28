import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

    public static void main(String[] args) {
        Path filepath = Paths.get("Textfile.txt");

        numberOfLines("Textfile.txt");

    }

    public static void numberOfLines(String filename) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            int lines = 0;
            while (reader.readLine() != null) lines++;
            reader.close();
            System.out.println(lines);

            //} catch (FileNotFoundException e) {
            //  System.out.println("0");
        } catch (IOException e) {
            System.out.println("0");
        }
    }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.