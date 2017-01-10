package com.onlineinteract.abstracts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class GeometricProgressionTest {

    @Test
    public void simpleGeometricProgressionWithDefaultBase2Start1Test() throws Exception {
        GeometricProgression geometricProgression = new GeometricProgression();
        assertEquals(1, geometricProgression.nextValue());
        assertEquals(2, geometricProgression.nextValue());
        assertEquals(4, geometricProgression.nextValue());
    }

    @Test
    public void simpleGeometricProgressionWithBase4Start2Test() throws Exception {
        GeometricProgression geometricProgression = new GeometricProgression(4, 2);
        assertEquals(2, geometricProgression.nextValue());
        assertEquals(8, geometricProgression.nextValue());
        assertEquals(32, geometricProgression.nextValue());
    }

    @Test
    public void simpleGeometricProgressionWithBase6DefaultStart1Test() throws Exception {
        GeometricProgression geometricProgression = new GeometricProgression(6);
        assertEquals(1, geometricProgression.nextValue());
        assertEquals(6, geometricProgression.nextValue());
        assertEquals(36, geometricProgression.nextValue());
    }
}