package com.onlineinteract.progressions;

import org.junit.Test;

import static org.junit.Assert.*;

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
}