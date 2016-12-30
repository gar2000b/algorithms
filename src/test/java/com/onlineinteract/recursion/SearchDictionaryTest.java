package com.onlineinteract.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchDictionaryTest {

	private String[] dictionaries;

	@Test
	public void shouldFindFirstEntryInDictionary() {
		dictionaries = new String[] { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		boolean search = SearchDictionary.search(dictionaries, "Abacus");
		
		assertEquals(true, search);
	}
	
	@Test
	public void shouldFindMiddleEntryInDictionary() {
		dictionaries = new String[] { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		boolean search = SearchDictionary.search(dictionaries, "Definition");
		
		assertEquals(true, search);
	}
	
	@Test
	public void shouldFindLastEntryInDictionary() {
		dictionaries = new String[] { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		boolean search = SearchDictionary.search(dictionaries, "Greater");
		
		assertEquals(true, search);
	}
	
	@Test
	public void shouldFindRandomEntryInDictionary() {
		dictionaries = new String[] { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		boolean search = SearchDictionary.search(dictionaries, "Bannana");
		
		assertEquals(true, search);
	}
	
	@Test
	public void shouldNotFindEntryInDictionary() {
		dictionaries = new String[] { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		boolean search = SearchDictionary.search(dictionaries, "Zerba");
		
		assertEquals(false, search);
	}
	
	@Test
	public void shouldNotFindEntryInEmptyDictionary() {
		dictionaries = new String[] {};
		boolean search = SearchDictionary.search(dictionaries, "Zerba");
		
		assertEquals(false, search);
	}
	
	@Test
	public void shouldNotFindEntryInNullDictionary() {
		dictionaries = null;
		boolean search = SearchDictionary.search(dictionaries, "Zerba");
		
		assertEquals(false, search);
	}

}
