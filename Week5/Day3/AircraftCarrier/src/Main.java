public class Main {
    public static void main(String[] args) {

        Carrier carrier = new Carrier(50,200);
        Carrier carrier2 = new Carrier(10, 300);

        Aircraft fly1 = new F16();
        Aircraft fly2 = new F35();
        Aircraft fly3 = new F16();
        Aircraft fly4 = new F35();


        carrier.add(fly1);
        carrier.add(fly2);
        carrier2.add(fly3);
        carrier2.add(fly4);

        carrier.fillAll();
        carrier2.fillAll();

        carrier.fight(carrier2);

        carrier.getStatus();
        carrier2.getStatus();

    }
}
