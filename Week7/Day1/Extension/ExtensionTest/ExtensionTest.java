import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by aze on 2017.04.04..
 */
public class ExtensionTest {

    private Extension extension = new Extension();

    @Test
    public void testAdd_2and3is5() {

        assertEquals(5, extension.add(2, 3));
    }

    @Test
   public void testAdd_1and4is5() {

        assertEquals(1623, extension.add(1000, 623));
    }

    @Test
    public void testMaxOfThree_first() {

        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    public void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(4, 5, 3));
    }

    @Test
    public void testMedian_four() {

        assertEquals(4, extension.median(Arrays.asList(7,1,3,5)));
    }

    @Test
    public void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    public void testIsVowel_r() {
        assertFalse(extension.isVowel('r'));
    }

    @Test
    public void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    public void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    public void testTranslate_noVowel() {
        assertEquals("krk", extension.translate("krk"));
    }
}