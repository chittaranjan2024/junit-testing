package com.guvi.junit_testing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@DisplayName("A test case for User Authentication")
public class TestUserAuthentication {

	UserAuthentication authentication=new UserAuthentication();
	
	@Test
	@DisplayName("First test case for userlogin")
	public void userLogin_testCase1()
	{
		String actualOutput=authentication.userLogin("admin@test.in", "admin@123");
		String expectedOutput="failed";
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	@Test
	@DisplayName("Second test case for userlogin")
	public void userLogin_testCase2()
	{
		String actualOutput=authentication.userLogin("admin@guvi.in", "admin@123");
		String expectedOutput="success";
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	//@Disabled
	@Test
	@DisplayName("third test case for userlogin")
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 2000)
	public void userLogin_testCase3()
	{
		String actualOutput=authentication.userLogin("admin", "admin@453");
		String expectedOutput="failed";
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	
	@Test
	public void userLogin_testCase4()
	{
		String st=null,st1=null;
		int ar[]= {1,2,3};
		int ar1[]= {1,2,3};
		assertTrue(12>7);
		assertFalse(12<7);
		assertNull(st);
		assertSame(st, st1);
		assertArrayEquals(ar, ar1);
		assertNotEquals(st, st1);
		
	}
}
