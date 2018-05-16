import java.util.Arrays;
import java.util.List;


public class Extension {

    int a;
    int b;
    int c;

    public Extension() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        return max;
    }

    int median(List<Integer> pool) {
        Object[] temp = pool.toArray();
        Arrays.sort(temp);
        int medianIndex;

        if (temp.length % 2 != 0) {
            medianIndex = (temp.length - 1) / 2;
            return (int) temp[medianIndex];
        } else {
            medianIndex = (temp.length) / 2;
            int value1 = (int) temp[medianIndex];
            int value2 = (int) temp[medianIndex - 1];
            return (value1 + value2) / 2;
        }

    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }
}