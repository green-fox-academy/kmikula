import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {

        Character[] charArray = {'c', 'i', 'r', 'c', 'l', 'e'};

        String converted = Arrays.stream(charArray)
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(converted);
    }
}

//Write a Stream Expression to convert a char array to a string!