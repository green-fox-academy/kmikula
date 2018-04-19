public class ChangeElement {

    public static void main(String[] args) {


        int[] s = {1, 2, 3, 8, 5, 6};


        System.out.println(changeElement(s));


    }


    private static int changeElement(int[] s) {


        for (int i = 0; i < s.length; i++) {


            if (s[i] == 8) {


                s[i] = 4;

            }


        }

        return s[3];

    }

}


