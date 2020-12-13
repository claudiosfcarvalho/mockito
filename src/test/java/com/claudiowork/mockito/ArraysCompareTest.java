package com.claudiowork.mockito;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void test() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testExceptions() {
		int[] numbers = null;
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(timeout = 100)
	public void testPerformance() {
		int[] numbers = {12,23,4,1};
		for (int i = 1; 1 < 1000000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}	
	}
}
