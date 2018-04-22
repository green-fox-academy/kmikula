import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please type in the operation (+, -, /, *, %): ");

        String operation = scanner.nextLine();


        System.out.println("Please input first number: ");

        int firstNumber = scanner.nextInt();


        System.out.println("Please input first number: ");

        int secondNumber = scanner.nextInt();


        System.out.println("Result is " + calculate(operation, firstNumber, secondNumber)+ ".");


    }

    private static int calculate(String operation, int firstNumber, int secondNumber) {


        int result = 0;


        if (operation.equals("+")) {


            result = firstNumber + secondNumber;


        } else if (operation.equals("-")) {


            result = firstNumber - secondNumber;

        } else if (operation.equals("*")) {


            result = firstNumber * secondNumber;

        } else if (operation.equals("/")) {


            result = firstNumber / secondNumber;

        } else if (operation.equals("")) {

            result = firstNumber % secondNumber;


        }
        return result;


    }


}


// Create a simple calculator application which reads the parameters from the prompt

// and prints the result to the prompt.

// It should support the following operations,

// create a method named "calculate()":

// +, -, *, /, % and it should support two operands.

// The format of the expressions must be: {operation} {operand} {operand}.

// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)


// You can use the Scanner class

// It should work like this:


// Start the program

// It prints: "Please type in the expression:"

// Waits for the user input

// Print the result to the prompt

// Exit


