import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibo = new Fibonacci();


    @Test
    public void testZeroFibonacci() {
        int expectedValue = 0;
        int currentValue = fibo.fibonacci(0);
        assertEquals(expectedValue, currentValue);
    }

    @Test
    public void fibonacciTest() {
        int expectedValue = 6765;
        int currentValue = fibo.fibonacci(20);
        assertEquals(expectedValue, currentValue);
    }

}