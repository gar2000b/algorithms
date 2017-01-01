package com.onlineinteract.recursion;

import java.math.BigInteger;

/**
 * Created by Digilogue on 15/11/2016.
 */
public class SimplePowerAlgorithm {

    public static void main(String[] args) {
        BigInteger answer = power(new BigInteger("2"), new BigInteger("2"));
        System.out.println(answer);

        answer = power(new BigInteger("1"), new BigInteger("2"));
        System.out.println(answer);

        answer = power(new BigInteger("2"), new BigInteger("4"));
        System.out.println(answer);

        answer = power(new BigInteger("3"), new BigInteger("2"));
        System.out.println(answer);

        answer = power(new BigInteger("2"), new BigInteger("5000"));
        System.out.println(answer);
    }

    public static BigInteger power(BigInteger b, BigInteger n) {
        if (n.equals(new BigInteger("0"))) {
            return new BigInteger("1");
        } else {
            return b.multiply(power(b, n.subtract(new BigInteger("1"))));
        }
    }
}
