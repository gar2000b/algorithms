package com.onlineinteract.general.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumers is a functional interface that represents a single
 * operation that takes a single input (the type) and returns no
 * result.
 * 
 * We declare an array list of strings and an empty array list.
 * 
 * Set up the Consumers of type String and give it a functional method
 * to invoke against an element of its type.
 * 
 * In our case, the List type ultimately extends iterable which has a
 * forEach() method which takes in Consumer types to process.
 * 
 * The andThen() method of Consumer basically takes in another
 * Consumer which allows us to process Consumer methods in order.
 * 
 * @author Digilogue
 *
 */
public class ChainConsumers {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

		List<String> result = new ArrayList<>();

		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s -> result.add(s);
		Consumer<String> c3 = s -> System.out.println(doSomething("Am I doing something?", "and something else?"));

		strings.forEach(c1.andThen(c2).andThen(c3));
		System.out.println("The size of result is: " + result.size());
	}

	private static String doSomething(String input, String another) {
		return input + " " + another;
	}
}
