import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {


        try {
            Path filePath = Paths.get("my-file.txt");

            Files.setAttribute(filePath, "dos:readonly", true);

            boolean writable = Files.isWritable(filePath);

            if (!writable) {

                System.out.println("Unable to write file: my-file.txt");

            }

            List<String> content = new ArrayList<>();
            content.add("Mikula KLára");
            Files.write(filePath, content);

            System.out.println(Files.readAllLines(filePath));

        } catch (Exception e) {

            System.out.println("Text file cannot be manipulated.");

        }

    }
}

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"
