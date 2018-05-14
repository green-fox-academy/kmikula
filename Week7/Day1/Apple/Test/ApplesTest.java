import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    private Apples greenApple = new Apples();

    @Test
    public void testGetApple() {
    String current="apple";
    String expected = greenApple.getApple();
    assertEquals(expected, current);

    }
}