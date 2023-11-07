package com.competency.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.competency.demo.service.CalculatorService;

public class CalculatorTest {
	
	List<Integer> list=Arrays.asList(3,5,8,1,2);
	int min,max;
	
	CalculatorService calculatorService;
	
	@BeforeEach
	void setup() {
		calculatorService=new CalculatorService();
	}


	@Test
	public void testAddition() {
		assertEquals(14, calculatorService.addition(7, 7));
	}
	
	@Test
	public void testSubstarct() {
		assertEquals(3, calculatorService.subtraction(7, 4));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(21, calculatorService.multiplication(7, 3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(5, calculatorService.division(15, 3));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, calculatorService.square(5));
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(5, calculatorService.squareRoot(25));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(6,calculatorService.factorial(3));
	}
	
	@Test
	public void testMinMax() {
		assertEquals("Min= "+1+", Max= "+8,calculatorService.minMax(list,min,max));
	}

}
