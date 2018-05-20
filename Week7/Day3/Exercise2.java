import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        double avg = numbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToDouble(number -> number)
                .average()
                .getAsDouble();

        System.out.println(avg);

    }
}
