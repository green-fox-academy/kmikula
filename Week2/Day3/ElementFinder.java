import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {

    static ArrayList<Integer> arrayList = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5));

    public static void main(String[] args) {


        System.out.println(containsSeven(arrayList));

    }


    public static String containsSeven(ArrayList<Integer> arrayList) {


        if (arrayList.contains(7)) {


            return "Hoorray";

        } else {

            return "Noooooo";


        }


    }


}


// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"

// The output should be: "Noooooo"

// Do this again with a different solution using different list methods!