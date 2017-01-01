package com.onlineinteract.recursion;

/**
 * Created by Digilogue on 15/11/2016.
 */
public class TowersOfHanoi {

    public static void printMove(String from, String to) {
        System.out.println("Move from " + from + " to " + to);
    }

    public static void towers(int n, String from, String to, String spare) {
        if (n > 0) {
            towers(n - 1, from, spare, to);
            printMove(from, to);
            towers(n - 1, spare, to, from);
        }
    }

    public static void main(String[] args) {
//        towers(1, "Begin", "Destination", "Aux");
//        System.out.println();
//        towers(2, "Begin", "Destination", "Aux");
//        System.out.println();
        towers(3, "Begin", "Destination", "Aux");
        System.out.println();
//        towers(4, "Begin", "Destination", "Aux");
//        System.out.println();
//        towers(5, "Begin", "Destination", "Aux");
//        System.out.println();
//        towers(6, "Begin", "Destination", "Aux");
    }
}
