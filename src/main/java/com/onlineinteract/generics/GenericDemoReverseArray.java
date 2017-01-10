package com.onlineinteract.generics;

/**
 * Created by Digilogue on 08/11/2016.
 */
public class GenericDemoReverseArray {

    public static void main(String args[]) {
        String[] array = new String[10];
        array[0] = "0";
        array[1] = "1";
        array[2] = "2";
        array[3] = "3";
        array[4] = "4";
        array[5] = "5";
        array[6] = "6";
        array[7] = "7";
        array[8] = "8";
        array[9] = "9";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----");
        reverse(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> void reverse(T[] data) {
        int low = 0, high = data.length - 1;
        while (low < high) {
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
    }
}
