package com.onlineinteract.recursion;

/**
 * Created by Digilogue on 14/11/2016.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("The factorial of 5 is: " + factorial(5));
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
