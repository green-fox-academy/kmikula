public class Sum {

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3));

    }

    private static int sum(int... numbers) {
        int sumOfNrs = 0;
        int threshold = 15;

        for (int number : numbers) {

           if (sumOfNrs < threshold) {
                sumOfNrs += number;

            }
        }
        return sumOfNrs;
    }
}

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer