package com.guvi.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Retention;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestNumberChecking {

	NumberChecking ob=new NumberChecking();
	
	@Test
	public void OddEvenChecking_testCase1()
	{
		boolean actualResult=ob.OddEvenChecking(7);
		boolean expectedResult=false;
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	
	@Test
	public void OddEvenChecking_testCase2()
	{
		boolean actualResult=ob.OddEvenChecking(8);
		boolean expectedResult=true;
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@RepeatedTest(5)
	public void OddEvenChecking_testCase3()
	{
		boolean actualResult=ob.OddEvenChecking(5);
		boolean expectedResult=true;
		
		assertEquals(expectedResult, actualResult);
		
	}
	
}
