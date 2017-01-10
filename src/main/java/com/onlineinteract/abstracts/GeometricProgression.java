package com.onlineinteract.abstracts;

import com.onlineinteract.progressions.Progression;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class GeometricProgression extends AbstractProgression {
    protected long base;

    public GeometricProgression() {
        this(2, 1);
    }

    public GeometricProgression(long base) {
        this(base, 1);
    }

    public GeometricProgression(long base, long start) {
        super(start);
        this.base = base;
    }

    protected void advance() {
        current *= base;
    }

}
