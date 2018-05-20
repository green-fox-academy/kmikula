import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise8 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Integer> freqs = new HashMap<>();
        for (int a : numbers) {
            freqs.merge(a,
                    1,
                    Integer::sum);
        }
        System.out.println("Frequencies:\n" + freqs);
    }
}

//Write a Stream Expression to find the frequency of numbers