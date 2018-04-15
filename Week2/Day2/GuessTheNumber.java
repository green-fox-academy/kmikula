import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String []args){

        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int storedNrUser1 = scanner.nextInt();

        System.out.println("Please make a guess:");
        int guessNrUser2 = scanner.nextInt();

        while(storedNrUser1 != guessNrUser2){

             if(storedNrUser1 > guessNrUser2){
                 System.out.println("The stored number is higher.");
                 System.out.println("Please enter a number:");
                 guessNrUser2 = scanner.nextInt();

             } else if(storedNrUser1 < guessNrUser2){
                 System.out.println("The stored number is lower.");
                 System.out.println("Please enter a number:");
                 guessNrUser2 = scanner.nextInt();

             }


        }
            System.out.println("You found the number: " + guessNrUser2);


    }
}
