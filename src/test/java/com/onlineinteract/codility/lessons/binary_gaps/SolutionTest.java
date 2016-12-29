package com.onlineinteract.codility.lessons.binary_gaps;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		int result = Solution.solution1(9);
		
		assertEquals(2, result);
	}
	
	@Test
	public void test2() {
		
		int result = Solution.solution1(529);
		
		assertEquals(4, result);
	}
	
	@Test
	public void test3() {
		
		int result = Solution.solution1(1);
		
		assertEquals(0, result);
	}
	
	@Test
	public void test4() {
		
		int result = Solution.solution1(3);
		
		assertEquals(0, result);
	}
	
	// Second solution
	
	@Test
	public void test5() {
		
		int result = Solution.solution(1);
		assertEquals(0, result);
	}
	
	@Test
	public void test6() {
		
		int result = Solution.solution(9);
		assertEquals(2, result);
	}
	
	@Test
	public void test7() {
		
		int result = Solution.solution(529);
		assertEquals(4, result);
	}
	
	@Test
	public void test8() {
		
		int result = Solution.solution(3);
		assertEquals(0, result);
	}

}
