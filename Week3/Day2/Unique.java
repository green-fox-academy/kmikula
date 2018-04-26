import java.util.Arrays;

public class Unique {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));

    }

    private static int[] unique(int[] numbers) {

        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        Arrays.sort(copyOfNumbers);
        //System.out.println(Arrays.toString(copyOfNumbers));
        int count = 0;

        for (int l = 1; l < copyOfNumbers.length; l++) {
            if (copyOfNumbers[l] == copyOfNumbers[l - 1]) {
                count++;
            }
        }

        int[] uniqueNrList = new int[copyOfNumbers.length - count - 1];
        int k = 0;
        for (int i = 1; i < copyOfNumbers.length; i++) {

            if (copyOfNumbers[i] != copyOfNumbers[i - 1]) {

                uniqueNrList[k++] = copyOfNumbers[i];
            }
        }
        return uniqueNrList;
    }
}


//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//   System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`