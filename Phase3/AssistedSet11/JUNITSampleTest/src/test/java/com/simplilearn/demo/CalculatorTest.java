package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
		System.out.println("Calculator initiated");
	}
	
	@AfterEach
	public void tearDown() {
		calc = null;
		System.out.println("Calculator closed");
	}
	@Test
	public void addTest() {
		assertEquals(7, calc.add(4, 3));
	}
	
	@Test
	public void subTest() {
		assertEquals(9, calc.sub(12, 3));
		assertNotEquals(7, calc.sub(4,3));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(12, calc.multiply(4, 3));
		assertNotEquals(7, calc.multiply(4,3));
	}
	
	@Test
	public void divideTest() {
		assertEquals(1, calc.divide(4, 3));
		assertNotEquals(7, calc.divide(4,3));
	}

}
