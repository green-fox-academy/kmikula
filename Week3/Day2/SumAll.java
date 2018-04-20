public class SumAll {


    public static void main(String[] args) {


        int[] ai = {3, 4, 5, 6, 7};

        int sum = 0;


        System.out.println(sumAll(ai, sum));

    }


    private static int sumAll(int[] ai, int sum) {


        for (int i = 0; i < ai.length; i++) {


            sum += ai[i];

        }


        return sum;

    }


}


