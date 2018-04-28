import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyFile {

    public static void main(String[] args) {

        Path fileFrom = Paths.get("FirstFile.txt");
        Path fileTo = Paths.get("SecondFile.txt");

        ArrayList<String> content = new ArrayList<>(Arrays.asList(
                "kék",
                "sárga",
                "zöld"
        ));

        try {
            Files.write(fileFrom, content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(copyFile(fileFrom, fileTo));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean copyFile(Path fileFrom, Path fileTo) throws IOException {

        Files.copy(fileFrom, fileTo, StandardCopyOption.REPLACE_EXISTING);

        boolean copyCompleted = (Files.readAllLines(fileFrom).equals(Files.readAllLines(fileTo)));

        return copyCompleted;
    }
}


// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful