public class IncrementElement {
    public static void main(String[] args) {


        int[] t = {1, 2, 3, 4, 5};


        System.out.println(incrementElement(t));


    }


    private static int incrementElement(int[] t) {


        t[2]++;


        return t[2];

    }


}
