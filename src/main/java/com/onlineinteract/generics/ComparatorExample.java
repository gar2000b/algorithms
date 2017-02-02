package com.onlineinteract.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.onlineinteract.generics.comparator.AgeComparator;
import com.onlineinteract.generics.comparator.ReverseComparator;

/**
 * This serves to demonstrate the use of Comparators using Generics.
 * 
 * The first example is more about instantiating types passing in
 * generic parameters. It takes a list of persons and sorts them
 * passing in our bespoke AgeComparator.
 * 
 * The second example is a little more interesting as we actually
 * implement the generic types in the new ReverseComparator, passing
 * it up the chain when it implements the Comparator interface. This
 * uses the adapter pattern and takes in and assigns a delegate
 * comparator of the same generic type - in our case the
 * ageComparator. When Collections.sort() is called against the
 * ReverseComparator, the compare method will be invoked (also
 * parameterised with the generic type specified) which of course
 * invokes the delegateComparator, except we multiply it by -1 in
 * order to reverse the result, hence ReverseComparator.
 * 
 * Classes to view: ReverseComparator, AgeComparator, Person
 * 
 * @author Digilogue
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {
		Person p1 = new Person(21, "Bob");
		Person p2 = new Person(23, "Gill");
		Person p3 = new Person(18, "Sandra");

		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		System.out.println(personList);
		Collections.sort(personList, new AgeComparator());
		System.out.println(personList);

		Collections.sort(personList, new ReverseComparator<Person>(new AgeComparator()));
		System.out.println(personList);
		
		AgeComparator ac = new AgeComparator();
		int compare = ac.compare(p1, p2);
		System.out.println(compare);
	}

}
