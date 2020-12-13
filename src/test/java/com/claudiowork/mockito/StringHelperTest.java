package com.claudiowork.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper sh;
	
	@Before
	public void before() {
		System.out.println("Before ok");
		if (null == sh) {
		 sh = new StringHelper();
		}
	}
	
	@After
	public void after() {
		System.out.println("After ok");
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		String actual = sh.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame("A"));
		assertTrue(sh.areFirstAndLastTwoCharactersTheSame("AA"));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame("AAC"));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame("AACD"));
	}

}
