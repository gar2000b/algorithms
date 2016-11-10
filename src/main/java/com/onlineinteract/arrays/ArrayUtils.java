package com.onlineinteract.arrays;

import java.util.Arrays;

/**
 * Created by Digilogue on 10/11/2016.
 */
public class ArrayUtils {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = Arrays.copyOf(a, 3);
        int[] c = Arrays.copyOf(a, 7);
        int[] d = {6, 3, 14, 8, 2};

        // print copied array of first 3 elements
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println();

        // prints copied array with padding of default 0 for extra elements
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        // false
        System.out.println(Arrays.equals(a, b));

        // print out array.
        System.out.println(Arrays.toString(a));

        // sorts array on natural ordering
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        // binary search of value - returns index position
        int index = Arrays.binarySearch(d, 6);
        System.out.println("Binary search of value 6, yields index pos of: " + index);
    }
}
