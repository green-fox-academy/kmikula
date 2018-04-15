import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {

    static ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    static ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    static ArrayList<String> matches = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.println(makingMatches(girls, boys));

    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        if (girls.size() < boys.size()) {
            for (int i = 0; i < girls.size(); i++) {

                matches.add(girls.get(i));
                matches.add(boys.get(i));
            }
            return matches;
        } else {
            for (int i = 0; i < boys.size(); i++) {

                matches.add(girls.get(i));
                matches.add(boys.get(i));

            }
            return matches;


        }
    }
}



// Write a method that joins the two lists by matching one girl with one boy into a new list
// Expected output: "Eve", "Joe", "Ashley", "Fred"...
