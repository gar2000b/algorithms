package com.onlineinteract.general.innerandnestedclasses;

/**
 * Outer class test with static nested class DEF.
 * 
 * * DEF can only reach out to the outer static members (not instance
 * variables).
 * 
 * @author Digilogue
 *
 */
public class Test2 {

	int a = 12;
	static int b = 31;
	static int c = 64;
	
	public void testNestedInstantiation() {
		DEF def = new DEF();
		System.out.println("testNestedInstantiation: " + def.aa);
	}

	static class DEF {
		int aa = Test2.c = 24;
		int c = b;

//		int c = a;
		
//		public Test2 getParent() {
//			return Test2.this;
//		}
	}
}
