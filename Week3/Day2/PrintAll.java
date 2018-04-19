public class PrintAll {

    public static void main(String[] args) {


        int[] af = {4, 5, 6, 7};


        printAll(af);


    }


    private static int printAll(int[] af) {


        for (int i = 0; i < af.length; i++) {


            System.out.println(af[i]);

        }


        return 0;

    }


}
