package com.onlineinteract.progressions;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class ArithmeticProgression extends Progression {

    protected long increment;

    public ArithmeticProgression() {
        this(1, 0);
    }

    public ArithmeticProgression(long stepSize) {
        this(stepSize, 0);
    }

    public ArithmeticProgression(long stepSize, long start) {
        super(start);
        increment = stepSize;
    }

    protected void advance() {
        current += increment;
    }
}
