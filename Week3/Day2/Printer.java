public class Printer {

    public static void main(String[] args) {


        String userInput1 = "Text1";

        String userInput2 = "Text2";

        String userInput3 = "Text3";

        String userInput4 = "Text4";


        printer(userInput1, userInput2, userInput3, userInput4);


    }


    private static void printer(String... userInput) {


        for (int i = 0; i < userInput.length; i++) {


            System.out.print(userInput[i]);

            System.out.print(" ");


        }


    }


}

