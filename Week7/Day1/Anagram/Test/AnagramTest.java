import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramTest {

    Anagram anagram = new Anagram();

    private String first = "elbow";
    private String second = "below";
    private String third ="random";

    @Test
    public void testIsAnagramTrue() {
        boolean tested = this.anagram.isAnagram(first, second);
        assertTrue(tested);

    }

    @Test
    public void testIsAnagramFalse() {
        boolean tested = this.anagram.isAnagram(first, third);
        assertFalse(tested);

    }
}