package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calcTest;

	@BeforeEach 
	public void beforeEach() {
		calcTest = new Calculator();
	}
	
	@Test
	@DisplayName("Sum is correct test")
	public void checkIfSumIsCorrect() {
		float sum = calcTest.add(2.5F, 2.5F);
		assertEquals(5, sum);
	}
	
	@Test
	@DisplayName("Subtract is correct test")
	public void checkIfSubtractionIsCorrect() {
		float subtraction = calcTest.subtract(2.5F, 2.5F);
		assertEquals(0, subtraction);
	}
	
	@Test
	@DisplayName("Multiply is correct test")
	public void checkIfMultiplyIsCorrect() {
		float product = calcTest.multiply(3.3F, 2);
		assertEquals(6.6F, product);
	}
	
	@Test
	@DisplayName("Division is correct test")
	public void checkIfDivisionIsCorrect() {
		float quotient = 0;
		try {
			quotient = calcTest.divide(3F, 2F);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(1.5F, quotient);
		
	}
	
	@Test
	@DisplayName("Division by zero throw an Exception test")
	public void divisionByZeroThrowException() {
		assertThrows(Exception.class,
				() -> calcTest.divide(1, 0),
				"Division by zero must throw an Exception");
	}
	
	@Test
	@DisplayName("A regular division does not throw an Exception test")
	public void regularDivisionDoesNotThrowException() {
		assertDoesNotThrow(() -> calcTest.divide(3F, 2F),
				"A regular division must not throw an Exception");
	}
	
}
