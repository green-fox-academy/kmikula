import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    static ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));


    public static void main(String[] args) {

        System.out.println(checkNums(list));


    }

    public static boolean checkNums(ArrayList<Integer> list) {


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16));


        for (int i = 0; i < list2.size(); i++) {


            if (!list.contains(list2.get(i))) {


                return false;

            }


        }

        return true;

    }
}


// Check if list contains all of the following elements: 4,8,12,16

// Create a method that accepts list as an input

// it should return "true" if it contains all, otherwise "false"
