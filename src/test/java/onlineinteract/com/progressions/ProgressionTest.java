package onlineinteract.com.progressions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class ProgressionTest {

    private Progression progression;

    @Before
    public void setUp() throws Exception {
        progression = new Progression();

    }

    @Test
    public void simpleProgressionTest() {
        assertEquals(0, progression.nextValue());
    }

    @Test
    public void multipleProgressionsTest() {
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        assertEquals(4, progression.nextValue());
    }

    @Test
    public void multipleProgressionsViaAdvanceTest() {
        progression.advance();
        progression.advance();
        progression.advance();
        progression.advance();
        assertEquals(4, progression.nextValue());
    }

    @Test
    public void printProgressionTest() throws Exception {
        progression.printProgression(4);
        assertEquals(4, progression.nextValue());
    }
}