package com.onlineinteract.general.innerandnestedclasses;

public class App {

	// Instantiating another objects inner class
	static Test.ABC abc = new Test().new ABC();
	// Instantiating another objects static nested class
	static Test2.DEF def = new Test2.DEF();

	public static void main(String[] args) {

		// Demonstrating that the inner classes instance variables
		// were properly assigned to its outer instance and static
		// member variables. Drill into Test.java to see...
		System.out.println(abc.aa);
		System.out.println(abc.c);
		// Invokes the inner getParent() to return the outer instance
		// then invokes testInnerInstantiation() against the outer.
		abc.getParent().testInnerInstantiation();

		// Demonstrating that the nested classes instance variables
		// were properly assigned to its outer static
		// member variables. Drill into Test.java to see...
		System.out.println(def.aa);
		// Forced to instantiate the outer (as the nested can't
		// reference Test2.this as its not accessible in scope - just
		// like it can't access instance member variables) to
		// invoke the testNestedInstantiation().
		new Test2().testNestedInstantiation();
	}
}
