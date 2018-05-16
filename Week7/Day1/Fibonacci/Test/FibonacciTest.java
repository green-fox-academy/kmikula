import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibo = new Fibonacci();


    @Test
    public void testZeroFibonacci() {
        long expectedValue = 0;
        long currentValue = fibo.fibonacci(0);
        assertEquals(expectedValue, currentValue);
    }

    @Test
    public void fibonacciTest() {
        long expectedValue = 6765;
        long currentValue = fibo.fibonacci(20);
        assertEquals(expectedValue, currentValue);
    }

    @Test
    public void fibonacciTest2() {
        long expectedValue = 13;
        long currentValue = fibo.fibonacci(7);
        assertEquals(expectedValue, currentValue);
    }

    @Test
    public void fibonacciTest3() {
        long expectedValue = 1;
        long currentValue = fibo.fibonacci(2);
        assertEquals(expectedValue, currentValue);
    }

    @Test
    public void fibonacciTest4() {
        long expectedValue = 5702887;
        long currentValue = fibo.fibonacci(34);
        assertEquals(expectedValue, currentValue);
    }


}