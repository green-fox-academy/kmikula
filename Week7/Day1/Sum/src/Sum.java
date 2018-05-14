import java.util.ArrayList;

public class Sum {

    int sum;
    ArrayList<Integer> values;

    public Sum() {

    }

    public Sum(ArrayList<Integer> values) {

        this.values = values;
    }

    public int sumValues(ArrayList<Integer> values) {
        this.values = values;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        return sum;
    }
}

