public class CreatePalindrome {

    public static void main(String[] args) {

        String original = "greenfox";

        System.out.println(createPalindrome(original));
    }

    private static String createPalindrome(String original) {

        char[] charOriginal = original.toCharArray();
        char[] reversed = new char[charOriginal.length];
        int k = 0;

        for (int i = charOriginal.length - 1; i >= 0; i--) {

            reversed[k++] = charOriginal[i];
        }

        String rev = String.valueOf(reversed);
        String palindrome = original.concat(rev);
        return palindrome;
    }

}


