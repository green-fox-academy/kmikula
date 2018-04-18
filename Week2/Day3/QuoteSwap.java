import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {

    static ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    static int firstIndex = list.indexOf("do");
    static int secondIndex = list.indexOf("cannot");

    public static void main(String[] args) {


        System.out.println(quoteSwap(list, firstIndex, secondIndex));
    }

    private static String quoteSwap(ArrayList<String> list, int firstIndex, int secondIndex) {


        list.set(firstIndex, "cannot");
        list.set(secondIndex, "do");

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < list.size(); i++) {


            sb.append(list.get(i));
            sb.append(" ");

        }
        String correctSentence = sb.toString();
        return correctSentence;


    }

}


// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.
//    System.out.println(quoteSwap(list));
// Expected output: "What I cannot create I do not understand."