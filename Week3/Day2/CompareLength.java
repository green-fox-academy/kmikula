public class CompareLength {
    public static void main(String[] args) {


        int[] p1 = {1, 2, 3};

        int[] p2 = {4, 5};


        System.out.println(bigger(p1, p2));


    }


    private static boolean bigger(int[] p1, int[] p2) {


        if (p2.length > p1.length) {


            return true;

        }


        return false;

    }


}
