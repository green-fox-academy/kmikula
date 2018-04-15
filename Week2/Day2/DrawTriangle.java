import java.util.Scanner;

public class DrawTriangle {

    public static void main (String []args){

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number:");
        int userInput = scanner.nextInt();

        for(int i = 0; i <= userInput; i++){
            for(int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("/");
        }

    }
}
