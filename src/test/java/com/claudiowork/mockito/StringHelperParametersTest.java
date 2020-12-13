package com.claudiowork.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametersTest {

	StringHelper sh = new StringHelper();;
	String input;
	String expectedOutput;
	
	public StringHelperParametersTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Before
	public void before() {
		System.out.println("Input: " + input);
	}
	
	@After
	public void after() {
		System.out.println("---------------------------------");
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		String actual = sh.truncateAInFirst2Positions(input);
		assertEquals(expectedOutput, actual);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		System.out.println(input.substring(0, 1) + "-> False? " + sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 1)));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 1)));
		System.out.println(input.substring(0, 2) + "-> True? " + sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 2)));
		assertTrue(sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 2)));
		System.out.println(input.substring(0, 3) + "-> False? " + sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 3)));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame(input.substring(0, 3)));
		System.out.println(input + "-> False? " + sh.areFirstAndLastTwoCharactersTheSame(input));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame(input));
	}

}
