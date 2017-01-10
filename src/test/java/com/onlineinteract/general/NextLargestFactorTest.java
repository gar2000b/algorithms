package com.onlineinteract.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextLargestFactorTest {

	@Test
	public void shouldReturnLargestFactorOf10With5() {
		int largestFactor = NextLargestFactor.nextLargestFactor(10);
		assertEquals(5, largestFactor);
	}
	
	@Test
	public void shouldReturnLargestFactorOf11With11() {
		int largestFactor = NextLargestFactor.nextLargestFactor(11);
		assertEquals(11, largestFactor);
	}
	
	@Test
	public void shouldReturnLargestFactorOf12With6() {
		int largestFactor = NextLargestFactor.nextLargestFactor(12);
		assertEquals(6, largestFactor);
	}
	
	@Test
	public void shouldReturnLargestFactorOf9With3() {
		int largestFactor = NextLargestFactor.nextLargestFactor(9);
		assertEquals(3, largestFactor);
	}
	
	@Test
	public void shouldReturnLargestFactorOf3With3() {
		int largestFactor = NextLargestFactor.nextLargestFactor(3);
		assertEquals(3, largestFactor);
	}

	@Test
	public void shouldReturnLargestFactorOf2With2() {
		int largestFactor = NextLargestFactor.nextLargestFactor(2);
		assertEquals(2, largestFactor);
	}
	
	@Test
	public void shouldReturnLargestFactorOf4With2() {
		int largestFactor = NextLargestFactor.nextLargestFactor(4);
		assertEquals(2, largestFactor);
	}
}
