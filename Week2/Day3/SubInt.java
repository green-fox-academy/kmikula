import java.util.ArrayList;

public class SubInt {


    public static void main(String[] args) {

        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));

        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
    }

    public static ArrayList<Integer> subInt(int number, int[] lisfOfNumbers) {

        ArrayList<Integer> converted = new ArrayList<Integer>();
        ArrayList<Integer> index = new ArrayList<Integer>();

        for (int i = 0; i < lisfOfNumbers.length; i++) {
            converted.add(lisfOfNumbers[i]);
        }

        for (int j = 0; j < converted.size(); j++) {
            if ((((converted.get(j) / 10) > number) && ((converted.get(j) / 10) < (number + 1))) || ((converted.get(j) - number) % 10 == 0)) {

                index.add(j);
            }
        }
        return index;
    }

}

//  Create a function that takes a number and a list of numbers as a parameter
//  Returns the indeces of the numbers in the list where the first number is part of
//  Returns an empty list if the number is not part any of the numbers in the list
//  Example:
//  should print: `[0, 1, 4]`
//  should print: '[]'
