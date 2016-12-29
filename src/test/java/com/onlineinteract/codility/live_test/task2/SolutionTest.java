package com.onlineinteract.codility.live_test.task2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] A = {1,3,2,1};
		int[] B = {4,2,5,3,2};
		
		int solution = Solution.solution(A, B);
		assertEquals(2, solution);
	}
	
	@Test
	public void test2() {
		int[] A = {2,1};
		int[] B = {3,3};
		
		int solution = Solution.solution(A, B);
		assertEquals(-1, solution);
	}

}
