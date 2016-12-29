package com.onlineinteract.insertion;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ArrayContainerTest {

	private ArrayContainer arrayContainer;

	@Before
	public void setup() {

		arrayContainer = new ArrayContainer(new String[] { "The", "cat", "sat",
				"on", "the", "mouse", "mat" });
	}

	@Test
	public void insert_shouldInsertOneItemInArrayAtCorrectIndexPositionOfOne() {

		ArrayContainer.insert("fat", 1, arrayContainer.getArray(), 1, 6);

		assertEquals(
				true,
				Arrays.equals(arrayContainer.getArray(), new String[] { "The",
						"fat", "cat", "sat", "on", "the", "mouse" }));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void insert_shouldThrowArrayOutOfBoundsExceptionWhileTryingToAccessEigthElementAfterInsert() {

		ArrayContainer.insert("fat", 1, arrayContainer.getArray(), 1, 6);

		@SuppressWarnings("unused")
		String string = arrayContainer.getArray()[7];
	}

	@Test
	public void delete_shouldDeleteOneItemInArrayAtCorrectIndexPositionOfTwo() {

		ArrayContainer.delete(2, arrayContainer.getArray(), 2, 6);

		assertEquals(
				true,
				Arrays.equals(arrayContainer.getArray(), new String[] { "The",
						"cat", "on", "the", "mouse", "mat", null }));
	}

	@Test
	public void linearSearch_shouldReturnIndexPositionOfTarget()
			throws Exception {
		int indexFound = ArrayContainer.linearSearch("sat",
				arrayContainer.getArray(), 0, arrayContainer.getArray().length);

		assertEquals(2, indexFound);
	}

	@Test
	public void sortedLinearSearch_shouldReturnIndexPositionOfTarget()
			throws Exception {
		int indexFound = ArrayContainer.sortedLinearSearch("sat",
				arrayContainer.getArray(), 0, arrayContainer.getArray().length);

		assertEquals(2, indexFound);
	}

	@Test
	public void binarySearch_shouldReturnIndexPositionOfTarget()
			throws Exception {

		// We have to put the array into sorted order first for the Binary
		// Search.
		arrayContainer = new ArrayContainer(new String[] { "cat", "mat",
				"mouse", "on", "sat", "the", "The" });

		int indexFound = ArrayContainer.binarySearch("sat",
				arrayContainer.getArray(), 0,
				arrayContainer.getArray().length - 1);

		assertEquals(4, indexFound);
	}

	@Test
	public void merge_shouldMergeTwoSortedArraysIntoOne() {

		// Construct our two arrays to be merged.
		String[] a1 = { "cow", "goat" };
		String[] a2 = { "cat", "dog", "fox", "lion", "tiger" };
		String[] a3 = new String[7];

		ArrayContainer.merge(a1, 0, a1.length - 1, a2, 0, a2.length - 1, a3, 0);

		assertEquals(
				true,
				Arrays.equals(a3, new String[] { "cat", "cow", "dog", "fox",
						"goat", "lion", "tiger" }));
	}

	@Test
	public void mergeSort_shouldSortArray() {
		String[] words1 = { "fox", "cow", "pig", "goat" };

		ArrayContainer.mergeSort(words1, 0, words1.length - 1);

		assertEquals(
				true,
				Arrays.equals(words1, new String[] { "cow", "fox", "goat",
						"pig" }));
	}

	@Test
	public void quickSort_shouldSortArray() {
		String[] words1 = { "fox", "cow", "pig", "cat", "rat", "lion", "tiger",
				"goat", "dog" };

		ArrayContainer.quickSort(words1, 0, words1.length - 1);

		assertEquals(
				true,
				Arrays.equals(words1, new String[] { "cat", "cow", "dog",
						"fox", "goat", "lion", "pig", "rat", "tiger" }));
	}

}
