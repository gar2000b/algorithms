package com.onlineinteract.codility.live_test.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
		
		int solution = Solution.solution(A);
		
		assertEquals(1, solution);
	}
	
	@Test
	public void test2() {
		int[] A = {4,-2,2,-3,1,4};
		
		int solution = Solution.solution(A);
		
		assertEquals(1, solution);
	}
	
	@Test
	public void test3() {
		int[] A = {0, -2147483648, -2147483648};
		
		int solution = Solution.solution(A);
		
		assertEquals(-1, solution);
	}
	
	@Test
	public void test4() throws Exception {
		int a = -4 + -4;
		assertEquals(-8, a);
	}
	
//	@Test
//	public void test5() throws Exception {
//		long a = -2147483648 + -2147483648;
//		assertEquals(4294967296l, a);
//	}

}
