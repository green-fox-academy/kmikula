import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        numbers.stream()
                .filter(number -> number > 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}


//Write a Stream Expression to get the squared value of the positive numbers from the following array