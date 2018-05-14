import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        Sum sum = new Sum(values);

        sum.values.add(5);
        sum.values.add(3);
        sum.values.add(12);

        System.out.println(sum.sumValues(values));

    }
}
