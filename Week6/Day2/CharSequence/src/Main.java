public class Main {

    public static void main(String[] args) {


        Gnirts text = new Gnirts("alverde");

        System.out.println(text.toString());

        System.out.println(text.length());

        try {
            System.out.println(text.charAt(0));
            System.out.println(text.subSequence(2, 5));
        } catch (Exception e) {
            System.out.println("Indexes are out of range.");
        }

        Shifter shifter = new Shifter("reference", 2);

        System.out.println(shifter.toString());
        System.out.println(shifter.length());

        try{
            System.out.println(shifter.charAt(3));
            System.out.println(shifter.subSequence(1, 3));
        } catch (Exception e) {
            System.out.println("Indexes are out of range.");
        }



    }
}