package com.onlineinteract.arrays;

/**
 * Created by Digilogue on 08/11/2016.
 * Class for storing high scores in an array in nondecreasing order.
 */
public class Scoreboard {
    private int numEntries = 0;              // number of actual entries
    private GameEntry[] board;               // array of game entries (names & scores)

    /**
     * Constructs an empty scoreboard with the given capacity for storing entries.
     */
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    /**
     * Attempt to add a new score to the collection (if it is high enough)
     */
    public void add(GameEntry e) {
        int newScore = e.getScore();
        // is the new entry e really a high score?
        // If the number of entries is less thn the board length or the new scrore is
        // greater than the lowest score (at end of array) then proceed to add new score.
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
        	// If the number of entries is less than the board length then we
        	// increment the number of entries by one.
            if (numEntries < board.length)        // no score drops from the board
                numEntries++;                       // so overall number increases
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            // while j > 0 and last entries score is less than the new score then 
            // shift entry to the right. Else break out of while.
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];              // shift entry from j-1 to j
                j--;                                // and decrement j
            }
            
            // when done, add new entry at position j.
            board[j] = e;
        }
    }

    public void add2(GameEntry e) {

        if (numEntries == 0) {
            board[0] = e;
            numEntries++;
            return;
        }
        if (numEntries < board.length) {
            // Aim to shift elements to the the right if > e.getScore()
            for (int i = numEntries - 1; i > -1; i--) {
                if (board[i].getScore() > e.getScore()) {
                    board[i + 1] = board[i];
                    if (i == 0) {
                        board[i] = e;
                        numEntries++;
                        break;
                    }
                } else {
                    board[i + 1] = e;
                    numEntries++;
                    break;
                }
            }
        } else {
            // aim to shift elements to left if < e.getScore().
            for (int i = 0; i < board.length; i++) {
                if (board[i + 1].getScore() > e.getScore()) {
                    board[i] = e;
                    break;
                } else {
                    board[i] = board[i + 1];
                }
            }
        }
    }

    /**
     * Remove and return the high score at index i.
     */
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];                 // save the object to be removed
        for (int j = i; j < numEntries - 1; j++)   // count up from i (not down)
            board[j] = board[j + 1];                   // move one cell to the left
        board[numEntries - 1] = null;              // null out the old last score
        numEntries--;
        return temp;                               // return the removed object
    }

    public GameEntry remove2(int index) {
        GameEntry temp = board[index];

        for (int i = index; i < numEntries - 1; i++) {
            board[i] = board[i + 1];
        }

        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    /**
     * Returns a string representation of the high scores list.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int j = 0; j < numEntries; j++) {
            if (j > 0)
                sb.append(", ");                   // separate entries by commas
            sb.append(board[j]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // The main method
        Scoreboard highscores = new Scoreboard(5);
        String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
        int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};

        for (int i = 0; i < names.length; i++) {
            GameEntry gE = new GameEntry(names[i], scores[i]);
            System.out.println("Adding " + gE);
            highscores.add(gE);
            System.out.println(" Scoreboard: " + highscores);
        }
        System.out.println("Removing score at index " + 3);
        highscores.remove(3);
        System.out.println(highscores);
        System.out.println("Removing score at index " + 0);
        highscores.remove(0);
        System.out.println(highscores);
        System.out.println("Removing score at index " + 1);
        highscores.remove(1);
        System.out.println(highscores);
        System.out.println("Removing score at index " + 1);
        highscores.remove(1);
        System.out.println(highscores);
        System.out.println("Removing score at index " + 0);
        highscores.remove(0);
        System.out.println(highscores);
    }
}