import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {

    static ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    public static void main(String []args){

        System.out.println(appendA(far));

    }

    private static ArrayList<String> appendA(ArrayList<String> far){

        for(int i=0; i<far.size(); i++){

            StringBuilder sb = new StringBuilder(far.get(i));

            sb.append('a');

            far.set(i,sb.toString());
        }

        return far;
    }
}


// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.