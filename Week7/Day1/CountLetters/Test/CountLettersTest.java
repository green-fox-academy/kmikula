import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    private CountLetters cl = new CountLetters();

    @Test
    public void charsCounted() {
        int current = cl.createDictionary("alma").get('a');
        int expected = 2;
        assertEquals(expected, current);
    }

    @Test
    public void charsCounted2() {
        int current = cl.createDictionary("hubbabubba").get('u');
        int expected = 2;
        assertEquals(expected, current);
    }

    @Test
    public void charsCounted3() {
        int current = cl.createDictionary("hubbabubba").get('b');
        int expected = 5;
        assertEquals(expected, current);
    }

    @Test
    public void testEmptyInput() {
        int current = cl.createDictionary("").get('a');
        int expected = 0;
        assertEquals(expected, current);
    }
}