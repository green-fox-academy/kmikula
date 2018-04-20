public class SwapElements {


    public static void main(String[] args) {


        String[] abc = {"first", "second", "third"};




        swapElements(abc);

    }


    private static void swapElements(String[] abc) {

        String a = new String();

        a = abc[2];

        abc[2] = abc[0];

        abc[0] = a;

        for(int i = 0; i<abc.length; i++){

            System.out.println(abc[i]);
        }


    }


}
