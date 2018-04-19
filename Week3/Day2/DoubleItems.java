import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {


        int[] ag = {3, 4, 5, 6, 7};


        System.out.println(Arrays.toString(doubleItems(ag)));

    }


    private static int[] doubleItems(int[] ag) {


        for (int i = 0; i < ag.length; i++) {


            ag[i] *= 2;


        }
        return ag;


    }


}
