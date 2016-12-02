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

}
