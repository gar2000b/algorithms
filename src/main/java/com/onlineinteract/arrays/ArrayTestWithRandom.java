package com.onlineinteract.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Digilogue on 10/11/2016.
 */
public class ArrayTestWithRandom {

    public static void main(String[] args) {
        int[] data = new int[10];
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
        int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
        System.out.println("arrays equal before sort: " + Arrays.equals(data, orig));
        Arrays.sort(data); // sorting the data array (orig is unchanged)
        System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));
    }
}
