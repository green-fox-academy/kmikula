import java.util.*;

public class CountLetters {

    HashMap<Character, Integer> dictionary;

    public CountLetters() {
        this.dictionary = new HashMap<>();

    }

    public HashMap<Character, Integer> createDictionary(String input) {

        for (int i = 0; i < input.length(); i++) {
            if (!dictionary.containsKey(input.charAt(i))) {
                dictionary.put(input.charAt(i), 1);
            } else {
                int occ = dictionary.get(input.charAt(i));
                dictionary.put(input.charAt(i), ++occ);
            }

        }
        return dictionary;
    }
}
