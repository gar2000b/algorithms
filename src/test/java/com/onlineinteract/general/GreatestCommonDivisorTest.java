package com.onlineinteract.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatestCommonDivisorTest {

	@Test
	public void shouldReturnGCDof6From6And12() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(6, 12);
		assertEquals(6, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From6And11() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(6, 11);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof4From8And12() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(8, 12);
		assertEquals(4, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From8And13() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(8, 13);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof0From0And0() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(0, 0);
		assertEquals(0, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From1And0() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(1, 0);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof0From0And1() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(0, 1);
		assertEquals(1, greatestCommonDivisor);
	}
	
	// All the same tests using the recursion version of the algorithm.
	
	@Test
	public void shouldReturnGCDof6From6And12WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(6, 12);
		assertEquals(6, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From6And11WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(6, 11);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof4From8And12WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(8, 12);
		assertEquals(4, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From8And13WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(8, 13);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof0From0And0WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(0, 0);
		assertEquals(0, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof1From1And0WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(1, 0);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof0From0And1WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(0, 1);
		assertEquals(1, greatestCommonDivisor);
	}
	
	@Test
	public void shouldReturnGCDof2From2And16WithRecursion() {
		int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisorUsingRecursion(2, 16);
		assertEquals(2, greatestCommonDivisor);
	}

}
