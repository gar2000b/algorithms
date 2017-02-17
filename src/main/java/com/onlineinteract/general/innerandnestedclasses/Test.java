package com.onlineinteract.general.innerandnestedclasses;

/**
 * Outer class test with default inner class ABC.
 * 
 * ABC can reach out to the outer instance and static member
 * variables.
 * 
 * @author Digilogue
 *
 */
public class Test {

	int a = 12;
	static int b = 31;
	
	public void testInnerInstantiation() {
		ABC abc = new ABC();
		System.out.println("testInnerInstantiation: " + abc.aa);
	}

	class ABC {
		int aa = Test.this.a = 24;
		int c = b;
		
		public Test getParent() {
			return Test.this;
		}
	}
}
