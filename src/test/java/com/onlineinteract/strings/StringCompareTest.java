package com.onlineinteract.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompareTest {

	@Test
	public void shouldReturnGreaterThan0() {
		int result = StringCompare.strcmp("aaaa", "aaa");
		assertEquals(1, result);
	}

	@Test
	public void shouldReturnLessThan0() {
		int result = StringCompare.strcmp("aaa", "aaaa");
		assertEquals(-1, result);
	}

	@Test
	public void shouldReturnEquals0() {
		int result = StringCompare.strcmp("aaaa", "aaaa");
		assertEquals(0, result);
	}

	@Test
	public void shouldReturnEquals0IfBothEntriesAreNull() {
		int result = StringCompare.strcmp(null, null);
		assertEquals(0, result);
	}

	@Test
	public void shouldReturnGreaterThan0IfSecondEntryIsNull() {
		int result = StringCompare.strcmp("aaaa", null);
		assertEquals(97, result);
	}

	@Test
	public void shouldReturnLessThan0IfFirstEntryIsNull() {
		int result = StringCompare.strcmp(null, "aaaa");
		assertEquals(-97, result);
	}

	@Test
	public void shouldReturnLessThan0IfSingleFirstEntryIsLessThanSingleSecondEntry() {
		int result = StringCompare.strcmp("a", "h");
		assertEquals(-7, result);
	}

}
