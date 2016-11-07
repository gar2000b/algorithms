package onlineinteract.com.progressions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class ArithmeticProgressionTest {

    private ArithmeticProgression progression;

    private void setupProgression() {
        progression = new ArithmeticProgression();
    }

    @Test
    public void simpleArithmeticProgressionTest() {
        setupProgression();
        assertEquals(0, progression.nextValue());
    }

    @Test
    public void multipleArithmeticProgressionsTest() {
        setupProgression();
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        assertEquals(4, progression.nextValue());
    }

    @Test
    public void multipleArithmeticProgressionsViaAdvanceTest() {
        setupProgression();
        progression.advance();
        progression.advance();
        progression.advance();
        progression.advance();
        assertEquals(4, progression.nextValue());
    }

    @Test
    public void printArithmeticProgressionTest() throws Exception {
        setupProgression();
        progression.printProgression(4);
        assertEquals(4, progression.nextValue());
    }

    private void setupArithmeticProgression(long stepSize) {
        setupProgression();
        progression = new ArithmeticProgression(stepSize);
    }

    @Test
    public void simpleArithmeticProgressionWith2AsStepSizeTest() {

        setupArithmeticProgression(2);
        assertEquals(0, progression.nextValue());
    }


    @Test
    public void multipleArithmeticProgressionsWith2AsStepSizeTest() {
        setupArithmeticProgression(2);
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        progression.nextValue();
        assertEquals(8, progression.nextValue());
    }

    @Test
    public void multipleArithmeticProgressionsViaAdvanceWith2AsStepSizeTest() {
        setupArithmeticProgression(2);
        progression.advance();
        progression.advance();
        progression.advance();
        progression.advance();
        assertEquals(8, progression.nextValue());
    }

    @Test
    public void printArithmeticProgressionWith2AsStepSizeTest() throws Exception {
        setupArithmeticProgression(2);
        progression.printProgression(4);
        assertEquals(8, progression.nextValue());
    }

    @Test
    public void simpleArithmeticProgressionWith2AsStepSize2AsStartTest() {

        progression = new ArithmeticProgression(2,2);
        assertEquals(2, progression.nextValue());
    }

}