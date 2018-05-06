public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("yellow", (float) 0.33);
        Sharpie sharpie2 = new Sharpie("green", (float) 0.25);
        Sharpie sharpie3 = new Sharpie("pink", (float) 0.10, 1);
        Sharpie sharpie4 = new Sharpie("blue", (float) 0.45);


        System.out.println(sharpie1.use());
        System.out.println(sharpie2.use());
        System.out.println(sharpie3.use());

        SharpieSet sharpieSet = new SharpieSet();

        SharpieSet.sharpies.add(sharpie1);
        SharpieSet.sharpies.add(sharpie2);
        SharpieSet.sharpies.add(sharpie3);
        SharpieSet.sharpies.add(sharpie4);

        System.out.println(sharpieSet.countUsable(SharpieSet.sharpies));

        sharpieSet.removeTrash(SharpieSet.sharpies);

        sharpieSet.listUsable(SharpieSet.sharpies);

    }
}