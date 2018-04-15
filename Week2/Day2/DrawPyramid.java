import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int userInput = scanner.nextInt();

        for (int i = 1; i <= (userInput*2); i += 2) {
            for (int j=(userInput*2); j>i; j-=2) {


                System.out.print("/");
            }

            for (int k = 0; k < i; k++) {


                System.out.print("*");
            }


            System.out.println("/");
        }


    }
}




