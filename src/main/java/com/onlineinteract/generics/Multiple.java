package com.onlineinteract.generics;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class Multiple<A, B> {
    A first;
    B second;
    B third;

    public Multiple(A a, B b, B c) {
        first = a;
        second = b;
        third = c;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public B getThird() {
        return third;
    }
}
