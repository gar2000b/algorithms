package com.onlineinteract.codility.lessons.perm_missing_elem;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] a = {2,3,1,5};
		
		int solution = Solution.solution(a);
		assertEquals(4, solution);
	}

	@Test
	public void test2() {
		int[] a = {1,5,2,4,6,7};
		
		int solution = Solution.solution(a);
		assertEquals(3, solution);
	}
	
	@Test
	public void test3() {
		int[] a = {2,3,1,5};
		
		int solution = Solution.solution2(a);
		assertEquals(4, solution);
	}

	@Test
	public void test4() {
		int[] a = {1,5,2,4,6,7};
		
		int solution = Solution.solution2(a);
		assertEquals(3, solution);
	}
	
	@Test
	public void test5() {
		int[] a = {2,3,4,5};
		
		int solution = Solution.solution2(a);
		assertEquals(1, solution);
	}
	
//	@Test
//	public void test6() {
//		int[] a = {1,2,3,4,5};
//		
//		int solution = Solution.solution2(a);
//		assertEquals(0, solution);
//	}

}
