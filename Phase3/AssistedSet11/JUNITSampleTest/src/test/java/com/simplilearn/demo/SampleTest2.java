package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest2 {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	@Test
	public void testOne() {
		System.out.println("This is my first JUNIT Test");
	}
	@Test
	public void testTwo() {
		System.out.println("This is my second JUNIT Test");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	@AfterAll
	public static void afterALL() {
		System.out.println("After All");
	}

}
