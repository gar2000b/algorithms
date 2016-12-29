package com.onlineinteract.codility.lessons.perm_check;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] A = {4,1,3,2};
		int solution = Solution.solution(A);
		
		assertEquals(1, solution);
	}
	
	@Test
	public void test2() {
		int[] A = {5,1,3,2};
		int solution = Solution.solution(A);
		
		assertEquals(0, solution);
	}
	
	@Test
	public void test3() {
		int[] A = {5,1,3,1};
		int solution = Solution.solution(A);
		
		assertEquals(0, solution);
	}

}
