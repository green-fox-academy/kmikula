import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int divisor = scanner.nextInt();

        divideANumber(divisor);

    }

    public static void divideANumber(int divisor) {
        try {
            int result = 10 / divisor;
            System.out.println("Result of 10 divided by " + divisor + " is: " + result);

        } catch (ArithmeticException a) {
            System.out.println("Fail");

        }

    }

}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0