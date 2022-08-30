package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assertion {

	public boolean checkAge(int age) {
		return age>=18;
	}
	@Test
	public void testAssertions() {
		assertEquals(6, 4+2);
		assertNotEquals(7, 4+2);
		assertTrue(checkAge(19));
		//assertTrue(checkAge(16));
		
		
		int a=56;
		int b=64;
		assertTrue(b>a);
		assertFalse(a>b);
		
		String name=null;
		assertNull(name);
		
		String name1="tejaswi";
		assertNotNull(name1);
	}
	
	@Test
	@DisplayName("Test Exception using Lambda")
	public void testThrow() {
		assertThrows(RuntimeException.class, ()->{throw new RuntimeException("not valid");});
		
		assertThrows(ArithmeticException.class, ()->{int x=10/0;System.out.println(x);});
		
		assertThrows(NullPointerException.class, ()->{String x=null;System.out.println(x.toLowerCase());});
	}

}
