public class AppendA {

    static String[] nimals = {"kuty", "macsk", "cic"};

    static String a = "a";

    public static void main(String[] args) {


        appendA(nimals, a);


    }

    private static void appendA(String[] nimals, String a) {


        for (int i = 0; i < nimals.length; i++) {


            System.out.println(nimals[i].concat(a));


        }


    }


}
