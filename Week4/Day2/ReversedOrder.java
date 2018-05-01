import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReversedOrder {

    public static void main(String[] args) {

        try {
            reversedOrder("reversed-order.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reversedOrder(String file) throws IOException {

        Path filepath = Paths.get(file);

        ArrayList<String> content = new ArrayList<String>(Files.readAllLines(filepath));

        for (int i = content.size() - 1; i >= 0; i--) {
            System.out.println(content.get(i));
        }
    }
}


// Create a method that decrypts reversed-order.txt