public class Factorio {

    public static void main(String []args){

    int userInput = 5;
    //int factorial = factorio(userInput);
        System.out.println(factorio(userInput));

    }

    private static int factorio(int userInput) {

        int factorialNr =1;

        for (int i = 1; i < userInput ; i++) {

            factorialNr *= i;

        }
        return factorialNr;
    }
}


// - Create a function called `factorio`
//   that returns it's input's factorial