import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Logs {

    public static void main(String[] args) {

        try {

            System.out.println(Arrays.toString(ipAddresses("log.txt")));
            System.out.println("GET / POST request ratio is " + getPostRation("log.txt"));

        } catch (Exception e) {

            System.out.println("File cannot be opened.");
        }
    }

    public static String[] ipAddresses(String filename) throws IOException {

        Path filepath = Paths.get(filename);
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(filepath));

        ArrayList<String> ipAddresses = new ArrayList<>();
        for (int i = 0; i < content.size(); i++) {

            ipAddresses.add(content.get(i).substring(27, 38));
        }

        String[] ipListArr = ipAddresses.toArray(new String[0]);


        return ipListArr;
    }

    public static float getPostRation(String filename) throws IOException {

        Path filepath = Paths.get(filename);
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(filepath));

        int countPost = 0;
        int countGet = 0;


        for (int i = 0; i < content.size(); i++) {

            if (content.get(i).substring(41, 45).equalsIgnoreCase("Post")) {
                countPost++;

            } else if (content.get(i).substring(41, 44).equalsIgnoreCase("Get")) {
                countGet++;

            }

        }

        float getPostRatio = ((float) countGet) / countPost;
        return getPostRatio;

    }

}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.