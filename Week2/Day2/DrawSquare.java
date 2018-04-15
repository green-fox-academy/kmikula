import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();



        for (int i = 1; i <= userInput; i++) {

            System.out.print("%");

            if ((i == 1) || (i == (userInput))) {
                for (int j = 0; j < userInput; j++) {
                    System.out.print("%");


                }
                System.out.println("/");

            } else {
                for (int k = 1; k <= (userInput - 2); k += (userInput - 2)) {


                    for (int l = 1; l < userInput; l++) {


                            System.out.print("/");

                        }
                        System.out.println("%");
                    }

                }


            }

        }
    }



/* } else {
         for (int k = 1; k <= (userInput - 2); k += (userInput - 2)) {


         for (int l = 1; l < userInput; l++) {


        System.out.print("/");

        }
        System.out.println("%");
        }

        }


        }

        }
        }
        }  */

