package com.onlineinteract.general.lambdas;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Example of a stream using predicates to filter the results.
 * 
 * Note: filter() is an intermediate operation. forEach() is a
 * terminal operation. Basically the stream (and its intermediaries)
 * cannot process until a terminal operation is called.
 * 
 * @author Digilogue on 25/02/17
 *
 */
public class FirstPredicates {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
		Predicate<String> p1 = s -> s.length() > 3;
		Predicate<String> p2 = Predicate.isEqual("two");
		Predicate<String> p3 = Predicate.isEqual("three");

		// Toggle comment to see different predicate combinations.
		// stream.filter(p1).forEach(System.out::println);
		stream.filter(p2.or(p3)).forEach(System.out::println);
	}
}
