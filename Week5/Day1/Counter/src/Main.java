public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(5);

        System.out.println(counter.add());
        System.out.println(counter.add(15));
        System.out.println(counter.reset());

    }
}
