package com.onlineinteract.algorithm_efficiency;

/**
 * Created by Digilogue on 15/11/2016.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37};
        int pos = binarySearch(data, 27);
        System.out.println("Position found at: " + pos);
    }

    public static int binarySearch(int[] data, int target) {

        int lowerBound = 0;
        int upperBound = data.length - 1;
        int midpoint = data.length / 2;

        while(true) {
            System.out.println("* entering loop");
            if (midpoint == 0 || midpoint > data.length - 1)
                return -1;

            if(data[midpoint] == target) {
                return midpoint;
            } else if (data[midpoint] > target) {
                upperBound = midpoint;
                midpoint = ((midpoint - lowerBound) / 2) + lowerBound;
            } else if (data[midpoint] < target) {
                lowerBound = midpoint;
                midpoint = ((upperBound - midpoint) / 2) + midpoint + 1;
            }
        }
    }
}
