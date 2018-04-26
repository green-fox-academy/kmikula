import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));

    }

    public static int[] bubble(int[] numbers) {

        int[] bubble = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(bubble);
        return bubble;
    }

    public static int[] advancedBubble(int[] numbers, boolean input) {

        int[] temp = Arrays.copyOf(numbers, numbers.length);
        int[] advancedBubble = Arrays.copyOf(temp, temp.length);

        if (input == false) {
            Arrays.sort(advancedBubble);

        } else {
            Arrays.sort(temp);
            int k = 0;

            for (int i = temp.length-1; i >0; i--) {
                advancedBubble[k++] = temp[i];
            }
        }
        return advancedBubble;
    }
}


//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `True` sort that list descending