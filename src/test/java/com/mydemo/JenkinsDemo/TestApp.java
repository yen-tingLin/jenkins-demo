package com.mydemo.JenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestApp {
	
	private App appObj;
	
	@Before
	public void setUp() {
		appObj = new App();
	}

	@Test
	public void testGreeting() {
		String greetingStr = "hi there";
		String result = appObj.greeting(greetingStr);
		String expected =  greetingStr;
		
		assertEquals(expected, result);
	}

}
