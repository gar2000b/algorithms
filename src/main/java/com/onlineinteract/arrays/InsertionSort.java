package com.onlineinteract.arrays;

/**
 * Created by Digilogue on 10/11/2016.
 */
public class InsertionSort {

    /**
     * Insertion-sort of an array of characters into ascending order [small..large].
     * <p>
     * X2 loop constructs. The outer loop iterates over the whole collection starting from index position 1.
     * <p>
     * The inner loop takes that (current index pos from out loop) and works back to 0 swapping (current with current
     * - 1) if (current is smaller than current - 1). If it is not, we break out the loop and assign the current
     * inner index position to the current char.
     */
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            char cur = data[k];                    // time to insert cur=data[k]
            int j = k;                             // find correct index j for cur
            while (j > 0 && data[j - 1] > cur) {     // thus, data[j-1] must go after cur
                data[j] = data[j - 1];                 // slide data[j-1] rightward
                j--;                                 // and consider previous j for cur
            }
            data[j] = cur;                         // this is the proper place for cur
        }
    }

    public static void main(String[] args) {
        char[] a = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
        System.out.println(java.util.Arrays.toString(a));
        insertionSort(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}