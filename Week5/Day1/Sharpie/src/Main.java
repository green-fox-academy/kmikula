public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("yellow", (float) 0.33);
        Sharpie sharpie2 = new Sharpie("green", (float) 0.25);

        System.out.println(sharpie1.use());
        System.out.println(sharpie2.use());
    }
}
