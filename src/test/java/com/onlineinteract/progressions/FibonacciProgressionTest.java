package com.onlineinteract.progressions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class FibonacciProgressionTest {

    @Test
    public void simpleFibonacciProgressionStartingSequence0then1Test() throws Exception {
        FibonacciProgression fibonacciProgression = new FibonacciProgression();
        assertEquals(0, fibonacciProgression.nextValue());
        assertEquals(1, fibonacciProgression.nextValue());
        assertEquals(1, fibonacciProgression.nextValue());
        assertEquals(2, fibonacciProgression.nextValue());
        assertEquals(3, fibonacciProgression.nextValue());
        assertEquals(5, fibonacciProgression.nextValue());
        assertEquals(8, fibonacciProgression.nextValue());
    }

    @Test
    public void simpleFibonacciProgressionStartingSequence5then8Test() throws Exception {
        FibonacciProgression fibonacciProgression = new FibonacciProgression(5, 8);
        assertEquals(5, fibonacciProgression.nextValue());
        assertEquals(8, fibonacciProgression.nextValue());
        assertEquals(13, fibonacciProgression.nextValue());
        assertEquals(21, fibonacciProgression.nextValue());
        assertEquals(34, fibonacciProgression.nextValue());
        assertEquals(55, fibonacciProgression.nextValue());
        assertEquals(89, fibonacciProgression.nextValue());
    }

    @Test
    public void gets_8th_Value_From_Fibonacci_Sequence_Of_2_And_2_Expecting_42() {
        FibonacciProgression fibonacciProgression = new FibonacciProgression(2, 2);
        for (int i = 0; i < 7; i++) {
            fibonacciProgression.advance();
        }

        assertEquals(42, fibonacciProgression.nextValue());
    }
}