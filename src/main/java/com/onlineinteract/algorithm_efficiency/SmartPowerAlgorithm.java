package com.onlineinteract.algorithm_efficiency;

/**
 * Created by Digilogue on 15/11/2016.
 */
public class SmartPowerAlgorithm {

    public static void main(String[] args) {
        System.out.println("Smart power algorithm\n");

        int answer = power(2, 2);
        System.out.println(answer);

        answer = power(1, 2);
        System.out.println(answer);

        answer = power(2, 4);
        System.out.println(answer);

        answer = power(3, 2);
        System.out.println(answer);

        answer = power(40, 10);
        System.out.println(answer);
    }

    public static int power(int b, int n) {

        int p = 1, q = b, m = n;

        while (m > 0) {
            if (m % 2 != 0) p *= q;
            m /= 2;
            q *= q;
        }

        if (n == 0) {
            return 1;
        } else {
            return b * power(b, n - 1);
        }
    }
}
