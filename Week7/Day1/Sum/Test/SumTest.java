import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class SumTest {

    private ArrayList<Integer> values = new ArrayList<>();
    private Sum sum = new Sum(values);


    @Test
    public void testSum() {

        values.add(2);
        values.add(9);
        values.add(1);
        int expectedSum = sum.sumValues(values);
        int currentSum = values.get(0)+values.get(1)+values.get(2);
        assertEquals(expectedSum, currentSum);
    }

    @Test
    public void testSumWithEmptyList() throws Exception{


            int expectedSum = sum.sumValues(values);
            int currentSum = values.get(0) + values.get(1);

            assertEquals(expectedSum, currentSum);
            assertTrue(expectedSum == 0);

    }

    @Test
    public void testSumWithOneElement() {
        values.add(3);
        int expectedSum = sum.sumValues(values);
        int currentSum = 3;
        assertEquals(expectedSum, currentSum);
        assertTrue(expectedSum == 3);
    }

    @Test
    public void testWithNull(){
        values.add(0);
        int expectedSum = sum.sumValues(values);
        int currentSum = Integer.parseInt(null);
        assertEquals(expectedSum, currentSum);
    }



}