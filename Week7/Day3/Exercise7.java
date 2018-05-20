import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
    public static void main(String[] args) {

        String stringInput = "happyday";

        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : stringInput.toCharArray()) {
            freqs.merge(c,
                    1,
                    Integer::sum);
        }
        System.out.println("Frequencies:\n" + freqs);
    }
}

//Write a Stream Expression to find the frequency of characters in a given string