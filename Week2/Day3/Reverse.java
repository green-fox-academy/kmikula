public class Reverse {

   static String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    static int length = reversed.length();

    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) {

        System.out.println(reverse(reversed));

        }


    public static StringBuilder reverse(String reversed) {



        for (int i = (length - 1); i > -1; i--) {

            sb.append(Reverse.reversed.charAt(i));

        }

        return sb;
    }
}

// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.