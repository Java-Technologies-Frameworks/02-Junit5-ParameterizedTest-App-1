package com.jtf.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Calculator calc = null;

	@BeforeAll
	public static void beforeAll() {
		calc = new Calculator();
	}

	public static void afterAll() {
		calc = null;
	}

	// To make our method as Test method @Test annotation is required
	// if we remove the @Test method It will behave as normal method of normal java
	// class
	// if atleast one @Test method then we can ruun as Junit test class for that
	// method
	@Test
	public void testAdd() {
		// Calculator calc = new Calculator();
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;

		assertEquals(expectedResult, actualResult);
		// Assertion is came to pcture to validate the actaul result with expected
		// Result

	}

	@Test
	public void testMultiply() {
		// Calculator calc = new Calculator();
		Integer actualResult = calc.multiply(10, 20);
		Integer expectedResult = 200;
		assertEquals(expectedResult, actualResult);
	}

	// we are creating Calculator object multiple times which is not recommended ,
	// waste of memory
	// Recommended is create one object and reuse for each test method and nullify
	// that object after all test method executed

}
