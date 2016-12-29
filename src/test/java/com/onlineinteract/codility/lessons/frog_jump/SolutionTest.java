package com.onlineinteract.codility.lessons.frog_jump;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int solution = Solution.solution(10, 85, 30);
		
		assertEquals(3, solution);
	}
	
	@Test
	public void test2() {
		int solution = Solution.solution(10, 10, 30);
		
		assertEquals(0, solution);
	}
	
	@Test
	public void test3() {
		int solution = Solution.solution2(10, 85, 30);
		
		assertEquals(3, solution);
	}
	
	@Test
	public void test4() {
		int solution = Solution.solution2(10, 10, 30);
		
		assertEquals(0, solution);
	}

}
