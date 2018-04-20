import java.util.Arrays;


public class Reverse {


    public static void main(String[] args) {


        int[] aj = {3, 4, 5, 6, 7};


        System.out.println(Arrays.toString(reverse(aj)));


    }


    private static int[] reverse(int[] aj) {

        int[] copyAj = Arrays.copyOf(aj, 5);

        for (int i = 0; i < aj.length; i++) {


            aj[i] = copyAj[copyAj.length - i - 1];


        }


        return aj;

    }


}
