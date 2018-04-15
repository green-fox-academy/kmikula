import java.util.Scanner;

public class ParametricAverage {

    public static void main (String []args) {

        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int nrOfIntegers = scanner.nextInt();

        int sum =0;

        for(int i=0; i<nrOfIntegers; i++) {
            System.out.println("Make a guess: ");
            int guess = scanner.nextInt();
            sum += guess;

        }

        System.out.println(sum);

        float average = (float) sum / (float) nrOfIntegers;
        System.out.println(average);

    }
}
