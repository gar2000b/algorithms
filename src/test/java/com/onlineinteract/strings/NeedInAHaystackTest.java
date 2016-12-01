package com.onlineinteract.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class NeedInAHaystackTest {

	@Test
	public void shouldFindNeedleAtPosition4() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack(
				"azklneedleqbacszg", "needle");
		
		assertEquals(4, needleInHaystackPosition);
	}
	
	@Test
	public void shouldNotFindNeedle() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack(
				"azklneeleqbacszg", "needle");
		
		assertEquals(-1, needleInHaystackPosition);
	}
	
	@Test
	public void shouldFindNeedleAtBeginning() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack(
				"needleazklneelacsaeqbacszg", "needle");
		
		assertEquals(0, needleInHaystackPosition);
	}
	
	@Test
	public void shouldFindNeedleAtEnd() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack(
				"neevsddleazklneelacsaeqbacszgneedle", "needle");
		
		assertEquals(29, needleInHaystackPosition);
	}

}
