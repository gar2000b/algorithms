package com.onlineinteract.generics;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class App {
    public static void main(String[] args) {
        Multiple<Integer, String> multiple = new Multiple<>(123, "second", "third");
        Integer first = multiple.getFirst();
        String second = multiple.getSecond();
        String third = multiple.getThird();

        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
