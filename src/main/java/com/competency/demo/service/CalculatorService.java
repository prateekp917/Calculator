package com.competency.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int addition(int a, int b) {
		int result = a+b;
		return result;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a*b;
	}

	public double division(int a, int b) {
		return a/b;
	}

	public int square(int a) {
		return (int) Math.pow(a, 2);
	}

	public double squareRoot(int a) {
		return (int)Math.sqrt(a);
	}

	public double factorial(int a) {
		if(a==0){return 1;}
		int result=1;
		while(a>0) {
			result= result*a;
			a--;
		}
		return result;
	}

	public String minMax(List<Integer> list, int min, int max) {
		
		min= Collections.min(list);
		max= Collections.max(list);
		return "Min= "+min+", Max= "+max;
	}

	
}
