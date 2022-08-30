package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("This run on Windows OS");
	}
	
	@Test
	@DisabledOnOs({OS.MAC})
	public void notRunOnMac() {
		System.out.println("This not run on Mac OS");
	}
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println("This run on Mac OS");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("This run on Linux OS");
	}
	
	@Test
	@DisabledOnOs({OS.LINUX})
	public void notRunOnLinux() {
		System.out.println("This not run on Linux OS");
	}
}
