import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        numbers.stream()
                .map(number -> number * number)
                .filter(number -> number > 20)
                .forEach(System.out::println);

    }
}

//Write a Stream Expression to find which number squared value is more then 20 from the following array