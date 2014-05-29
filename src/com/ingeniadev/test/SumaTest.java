package com.ingeniadev.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ingeniadev.app.Calculator;
import com.ingeniadev.app.CalculatorInterface;

public class SumaTest {

	@Test
	public void sumTwoPositiveIntegers() {
		CalculatorInterface calc = new Calculator();
		Long[] total= new Long[]{calc.sum(new Long(1), new Long(2))}; 
		Long[] expecteds= new Long[]{new Long(3)};
		assertArrayEquals(expecteds, total);
	}
	
	@Test
	public void sumTwoNegativeIntegers() {
		CalculatorInterface calc = new Calculator();
		Long[] total= new Long[]{calc.sum(new Long(-1), new Long(-2))}; 
		Long[] expecteds= new Long[]{new Long(0)};
		assertArrayEquals(expecteds, total);
	}
		
	@Test
	public void sumTwoNulls() {
		Long param1 = null;
		Long param2 = null;
		CalculatorInterface calc = new Calculator();
		Long[] expecteds= new Long[]{new Long(0)};
		Long[] total= new Long[]{calc.sum(param1,param2)};
		assertArrayEquals(expecteds, total);
	}

}
