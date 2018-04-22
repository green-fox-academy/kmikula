import java.util.HashMap;

public class HeWillNever {


    static String out = "";


    public static void main(String[] args) {


        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};


        HashMap<Integer, String> map = new HashMap<Integer, String>();


        map.put(7, "run around and desert you");

        map.put(50, "tell a lie and hurt you ");

        map.put(49, "make you cry, ");

        map.put(2, "let you down");

        map.put(12, "give you up, ");

        map.put(1, "Never gonna ");

        map.put(11, "\n");

        map.put(3, "say goodbye ");



     /* for(int s : map.keySet()){

     System.out.println(s + ":"+map.get(s));  */


        out(notSoCrypticMessage, map);


    }


    private static void out(int[] notSoCrypticMessage, HashMap<Integer, String> map) {


        for (int i = 0; i < notSoCrypticMessage.length; i++) {


            out = map.get(notSoCrypticMessage[i]);


            System.out.println(out);

        }


    }


}


