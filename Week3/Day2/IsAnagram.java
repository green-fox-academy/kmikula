import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String original = "rail safety";
        String rearranged = "fairy tales";

        System.out.println(isAnagram(original, rearranged));
    }


    private static boolean isAnagram(String original, String rearranged) {

        char[] charOriginal = original.toCharArray();
        char[] charRearranged = rearranged.toCharArray();

        Arrays.sort(charOriginal);
        Arrays.sort(charRearranged);

        boolean isAnagram = Arrays.equals(charOriginal, charRearranged);

        return isAnagram;
    }
}
