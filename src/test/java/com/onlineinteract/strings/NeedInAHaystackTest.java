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

	/**
	 * Same tests as above only targeting the while implementation of the
	 * getNeedleInAHaystack() called getNeedleInAHaystack2().
	 */

	@Test
	public void shouldFindNeedleAtPosition4_2() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"azklneedleqbacszg", "needle");

		assertEquals(4, needleInHaystackPosition);
	}

	@Test
	public void shouldNotFindNeedle_2() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"azklneeleqbacszg", "needle");

		assertEquals(-1, needleInHaystackPosition);
	}

	@Test
	public void shouldFindNeedleAtBeginning_2() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"needleazklneelacsaeqbacszg", "needle");

		assertEquals(0, needleInHaystackPosition);
	}

	@Test
	public void shouldFindNeedleAtEnd_2() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"neevsddleazklneelacsaeqbacszgneedle", "needle");

		assertEquals(29, needleInHaystackPosition);
	}

	/**
	 * Same tests as above only targeting the optimised while implementation of
	 * the getNeedleInAHaystack2() called getNeedleInAHaystack3().
	 */

	@Test
	public void shouldFindNeedleAtPosition4_3() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"azklneedleqbacszg", "needle");

		assertEquals(4, needleInHaystackPosition);
	}

	@Test
	public void shouldNotFindNeedle_3() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"azklneeleqbacszg", "needle");

		assertEquals(-1, needleInHaystackPosition);
	}

	@Test
	public void shouldFindNeedleAtBeginning_3() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"needleazklneelacsaeqbacszg", "needle");

		assertEquals(0, needleInHaystackPosition);
	}

	@Test
	public void shouldFindNeedleAtEnd_3() {
		int needleInHaystackPosition = NeedInAHaystack.getNeedleInAHaystack2(
				"neevsddleazklneelacsaeqbacszgneedle", "needle");

		assertEquals(29, needleInHaystackPosition);
	}

}
