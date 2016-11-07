package com.onlineinteract.progressions;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class FibonacciProgression extends Progression {
    protected long prev;

    /**
     * Default constructor setting a starting sequence of (0, 1)
     */
    public FibonacciProgression() {
        this(0, 1);
    }

    /**
     * This constructor is interesting. It takes both first and second numbers.
     * It makes the current the first and the prev (second - first) which would actually have been the previous number
     * to first which is what we want since is starting point is actually the first number.
     * This simple arithmetic just happens to set an appropriate number to prev of 1 if the sequence starts (0, 1).
     * Although we know there isn't a prev of 1 (maybe a -1) before 0, this is what we need to proceed.
     *
     * @param first
     * @param second
     */
    public FibonacciProgression(long first, long second) {
        super(first);
        prev = second - first;
    }

    /**
     * The advance method is pretty logical. If you think of the two numbers we are evaluating,
     * prev is the left-hand number, current is the right-hand number => 3(lh), 5(rh). 3(lh) has been taken by
     * nextValue() which was current before this method call. So what we are working out here is
     * the new values for prev and current which will of course become 5(lh), 8(rh).
     * It's simple, prev = current and current is now = old prev + current (the last two numbers in the sequence
     * added together).
     */
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
