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

}
