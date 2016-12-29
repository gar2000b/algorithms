package com.onlineinteract.insertion.codility;

import static org.junit.Assert.*;

import org.junit.Test;

import com.onlineinteract.codility.Test1;

public class Test1Test {

	@Test
	public void test() {
		
		Test1 test1 = new Test1();
		
		int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
		
		int result = test1.solution(a, a.length - 1);
		
		assertEquals(1, result);
	}
	
	@Test
	public void test2() {
		
		Test1 test1 = new Test1();
		
		int[] a = {-1, -3, -4, -5, -1, -6, -2, -1};
		
		int result = test1.solution(a, a.length - 1);
		
		assertEquals(-1, result);
	}

}
