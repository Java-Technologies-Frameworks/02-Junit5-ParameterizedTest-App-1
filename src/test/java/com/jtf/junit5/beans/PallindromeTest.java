package com.jtf.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PallindromeTest {

	// no need to write 5 methods  use a single method and pass 5 inputs using ParameterizedTest 
	// @Test
	@ParameterizedTest
	@ValueSource(strings = { "racer", "madam", "hyderabad", "katak", "bangalore", "liril" })
	public void testIsPallindrome(String str) {
		PallindromeCheck pc = new PallindromeCheck();
		boolean actual = pc.isPallindorme(str);
		assertTrue(actual);

	}
}
