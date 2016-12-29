package com.onlineinteract.codility.lessons.tape_equilibrium;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int a[] = {3,1,2,4,3};
		
		int solution = Solution.solution(a);
		
		assertEquals(1, solution);
	}
	
	@Test
	public void test2() {
		int a[] = {3,1};
		
		int solution = Solution.solution(a);
		
		assertEquals(2, solution);
	}
	
	@Test
	public void test3() {
		int a[] = {1,1};
		
		int solution = Solution.solution(a);
		
		assertEquals(0, solution);
	}

}
