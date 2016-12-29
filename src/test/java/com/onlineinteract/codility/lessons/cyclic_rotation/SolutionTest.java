package com.onlineinteract.codility.lessons.cyclic_rotation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution(a, 1);

		assertEquals(true, Arrays.equals(new int[] { 5, 1, 2, 3, 4 }, solution));
	}

	@Test
	public void test2() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] solution = Solution.solution(a, 3);

		assertEquals(true, Arrays.equals(
				new int[] { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, solution));
	}

	@Test
	public void test3() {

		int[] a = { 1 };

		int[] solution = Solution.solution(a, 3);

		assertEquals(true, Arrays.equals(new int[] { 1 }, solution));
	}

	@Test
	public void test4() {

		int[] a = {};

		int[] solution = Solution.solution(a, 3);

		assertEquals(true, Arrays.equals(new int[] {}, solution));
	}

	@Test
	public void test5() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution(a, 5);

		assertEquals(true, Arrays.equals(new int[] { 1, 2, 3, 4, 5 }, solution));
	}

	@Test
	public void test6() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution(a, 6);

		assertEquals(true, Arrays.equals(new int[] { 5, 1, 2, 3, 4 }, solution));
	}

	@Test
	public void test7() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution(a, 5);

		assertEquals(true, Arrays.equals(new int[] { 1, 2, 3, 4, 5 }, solution));
	}

	@Test
	public void dummyModulo() {

		System.out.println(5 % 10); // 5
		System.out.println(10 % 5); // 0
		System.out.println(10 % 3); // 1
		System.out.println(2 % 4); // 2
		System.out.println(4 % 5); // 2

		assert (true);
	}

	// ---

	@Test
	public void test8() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution2(a, 1);

		assertEquals(true, Arrays.equals(new int[] { 5, 1, 2, 3, 4 }, solution));
	}

	@Test
	public void test9() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] solution = Solution.solution2(a, 3);

		System.out.println();
		for (int i = 0; i < solution.length; i++) {
			System.out.println(solution[i]);
		}

		assertEquals(true, Arrays.equals(
				new int[] { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, solution));
	}

	@Test
	public void test10() {

		int[] a = { 1 };

		int[] solution = Solution.solution2(a, 3);

		assertEquals(true, Arrays.equals(new int[] { 1 }, solution));
	}

	@Test
	public void test11() {

		int[] a = {};

		int[] solution = Solution.solution2(a, 3);

		assertEquals(true, Arrays.equals(new int[] {}, solution));
	}

	@Test
	public void test12() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution2(a, 5);

		assertEquals(true, Arrays.equals(new int[] { 1, 2, 3, 4, 5 }, solution));
	}

	@Test
	public void test13() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution2(a, 6);

		assertEquals(true, Arrays.equals(new int[] { 5, 1, 2, 3, 4 }, solution));
	}

	@Test
	public void test14() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution2(a, 5);

		assertEquals(true, Arrays.equals(new int[] { 1, 2, 3, 4, 5 }, solution));
	}
	
	@Test
	public void test15() {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] solution = Solution.solution2(a, 11);

		assertEquals(true, Arrays.equals(new int[] { 5, 1, 2, 3, 4 }, solution));
	}
}
