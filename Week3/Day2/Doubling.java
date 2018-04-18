public class Doubling {



    public static void main(String[] args) {

        int ak = 123;
        ak = doubling(ak);
        System.out.println(ak);

    }

    private static int doubling(int ak) {

        ak *= 2;
        return ak;
    }

}


// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`