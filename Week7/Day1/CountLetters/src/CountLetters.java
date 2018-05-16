import java.util.*;

public class CountLetters {

    String key;
    HashMap<Character, Integer> dictionary;

    public CountLetters() {
        this.dictionary = new HashMap<>();

    }

    public HashMap<Character, Integer> createDictionary(String input) {
        /* char[] temp = new char[input.length()];
       for (int i = 0; i < input.length(); i++) {
            temp[i] = input.charAt(i);
        }
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            if (dictionary.containsKey(temp[i]) == false) {
                dictionary.put(temp[i], 1);
            } else {
                int occ = dictionary.get(temp[i]);
                dictionary.put(temp[i], ++occ);
            }
        }*/

        for (int i = 0; i < input.length(); i++) {
            if (dictionary.containsKey(input.charAt(i)) == false) {
                dictionary.put(input.charAt(i), 1);
            } else {
                int occ = dictionary.get(input.charAt(i));
                dictionary.put(input.charAt(i), ++occ);
            }

        }
        /*List list	= new ArrayList(dictionary.entrySet());

        Object[] objects = dictionary.keySet().toArray();
        list = Arrays.asList(objects);
         Collections.sort(list);*/

        return dictionary;

    }
}
