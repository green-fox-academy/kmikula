import java.util.ArrayList;

public class Fibonacci {

    ArrayList<Integer> fibonacciNrs;

    public Fibonacci() {
        this.fibonacciNrs = new ArrayList<>();
    }

    public int fibonacci(int index) {


        fibonacciNrs.add(0);
        fibonacciNrs.add(1);

        int k = 2;

        while (fibonacciNrs.size() <= (index+1) ) {

            int sumOfPreviousTwo = fibonacciNrs.get(k - 2) + fibonacciNrs.get(k - 1);
            fibonacciNrs.add(sumOfPreviousTwo);
            k++;

        }
        return fibonacciNrs.get(index);
    }
}