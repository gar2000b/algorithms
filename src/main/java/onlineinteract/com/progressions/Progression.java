package onlineinteract.com.progressions;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class Progression {

    protected long current;

    public Progression() {
        this(0);
    }

    public Progression(long start) {
        current = start;
    }

    /**
     * Returns the next value of the progression and advances the current value.
     * @return current
     */
    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    /**
     * Advances the current value to the next value in the progression.
     */
    protected void advance() {
        current++;
    }

    /**
     * Prints the next n values of the progression.
     * @param n
     */
    public void printProgression (int n) {
        System.out.println(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.println(" " + nextValue());
        }
    }

}
