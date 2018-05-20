import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {

        String inputString = "Mae's friend Annie Allerton works at The Circle, a tech company where Mae gets a job in Customer Experience.";

        Object[] input = inputString.chars()
                .filter(Character::isUpperCase)
                .mapToObj(a -> (char) a)
                .toArray();

        System.out.println(Arrays.toString(input));
    }
}

//Write a Stream Expression to find the uppercase characters in a string!