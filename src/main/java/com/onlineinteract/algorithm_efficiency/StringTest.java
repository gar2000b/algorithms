package com.onlineinteract.algorithm_efficiency;

/**
 * Created by Digilogue on 14/11/2016.
 */
public class StringTest {

    /**
     * Uses repeated concatenation to compose a String with n copies of character c.
     */
    public static String repeat1(char c, int n) {
        String answer = "";
        for (int j = 0; j < n; j++)
            answer += c;
        return answer;
    }

    /**
     * Uses StringBuilder to compose a String with n copies of character c.
     */
    public static String repeat2(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++)
            sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        repeat1('c', 50000);
        long end = System.currentTimeMillis();
        long timeTaken = end - begin;
        System.out.println("Time taken to execute string concatenation over 50'000 times: " + timeTaken + "ms");

        begin = System.currentTimeMillis();
        repeat1('c', 100000);
        end = System.currentTimeMillis();
        timeTaken = end - begin;
        System.out.println("Time taken to execute string concatenation over 100'000 times: " + timeTaken + "ms");

        begin = System.currentTimeMillis();
        repeat1('c', 200000);
        end = System.currentTimeMillis();
        timeTaken = end - begin;
        System.out.println("Time taken to execute string concatenation over 200'000 times: " + timeTaken + "ms");

        // -------------------------------------

        begin = System.currentTimeMillis();
        repeat2('c', 50000);
        end = System.currentTimeMillis();
        timeTaken = end - begin;
        System.out.println("Time taken to execute string builder append over 50'000 times: " + timeTaken + "ms");

        begin = System.currentTimeMillis();
        repeat2('c', 100000);
        end = System.currentTimeMillis();
        timeTaken = end - begin;
        System.out.println("Time taken to execute string builder append over 100'000 times: " + timeTaken + "ms");

        begin = System.currentTimeMillis();
        repeat2('c', 200000);
        end = System.currentTimeMillis();
        timeTaken = end - begin;
        System.out.println("Time taken to execute string builder append over 200'000 times: " + timeTaken + "ms");
    }
}
