import java.util.Scanner;

public class DrawDiamond {

    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was


    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for(int i=1; i <= (userInput * 2); i+=2){
            for(int j = (userInput * 2); j>i; j-=2){

                System.out.print("/");

            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }

            System.out.println("/");
        }

        for(int i=1; i<(userInput * 2); i+=2){
            for(int j = 0; j<i; j+=2){

                System.out.print("/");

            }
            for(int k=(userInput * 2); k>i; k--){
                System.out.print("*");
            }

            System.out.println("/");
        }


    }
}
