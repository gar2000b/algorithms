package com.onlineinteract.codility.live_test.task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		String S = "00-44 48 5555 8361";
		
		String solution = Solution.solution(S);
		
		assertEquals("004-448-555-583-61", solution);
	}
	
	@Test
	public void test2() {
		String S = "0 - 22 1985--324";
		
		String solution = Solution.solution(S);
		
		assertEquals("022-198-53-24", solution);
	}

}
