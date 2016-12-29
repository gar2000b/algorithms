package com.onlineinteract.codility.lessons.odd_occurences_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] a = { 9, 3, 9, 3, 9, 7, 9 };
		int solution = Solution.solution(a);

		assertEquals(7, solution);
	}

	@Test
	public void test2() {
		int[] a = { 22, 46, 7, 91, 91, 7, 22 };
		int solution = Solution.solution(a);

		assertEquals(46, solution);
	}

	@Test
	public void test3() {
		int[] a = { 1 };
		int solution = Solution.solution(a);

		assertEquals(1, solution);
	}

	@Test
	public void test4() {
		int[] a = { 9, 3, 9, 3, 7 };
		int solution = Solution.solution(a);

		assertEquals(7, solution);
	}

	@Test
	public void test5() {
		int[] a = { 1, 9, 3, 9, 3 };
		int solution = Solution.solution(a);

		assertEquals(1, solution);
	}

	@Test
	public void test6() throws Exception {

		int a = 9;
		a ^= 3;
		a ^= 9;
		a ^= 3;
		a ^= 7;

		System.out.println(a);
	}

	@Test
	public void testName() throws Exception {
		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;

		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c);

		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c);

		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c);

		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c);

		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c);

		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2  = " + c);

		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c);

		// ----
		System.out.println();
		int firstValue = 61;
		int bitshiftTwoToRightValue = firstValue >> 2;
		int bitshiftTwoToLeftValue = firstValue << 2;
		System.out.println("int of: " + firstValue + " is: "
				+ Integer.toBinaryString(firstValue) + " in binary");
		System.out.println("int of: " + bitshiftTwoToRightValue + " is: "
				+ Integer.toBinaryString(bitshiftTwoToRightValue) + " in binary");
		System.out.println("after a bitshift of 2 to the right");
		System.out.println("int of: " + bitshiftTwoToLeftValue + " is: "
				+ Integer.toBinaryString(bitshiftTwoToLeftValue) + " in binary");
		System.out.println("after a bitshift of 2 to the left");
	}
	
	@Test
	public void test7() {
		int[] a = { 9, 3, 9, 3, 9, 7, 9 };
		int solution = Solution.solution2(a);

		assertEquals(7, solution);
	}

	@Test
	public void test8() {
		int[] a = { 22, 46, 7, 91, 91, 7, 22 };
		int solution = Solution.solution2(a);

		assertEquals(46, solution);
	}

	@Test
	public void test9() {
		int[] a = { 1 };
		int solution = Solution.solution2(a);

		assertEquals(1, solution);
	}

	@Test
	public void test10() {
		int[] a = { 9, 3, 9, 3, 7 };
		int solution = Solution.solution2(a);

		assertEquals(7, solution);
	}

	@Test
	public void test11() {
		int[] a = { 1, 9, 3, 9, 3 };
		int solution = Solution.solution2(a);

		assertEquals(1, solution);
	}

}
