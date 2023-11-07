package com.competency.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.competency.demo.service.CalculatorService;
import com.competency.demo.util.MinMaxList;

@RestController
@RequestMapping("/calculatorapi/v1")
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@GetMapping("/addition")
	@ResponseBody
	public String add(@RequestParam int a, @RequestParam int b) {
		return "Result: "+ calculatorService.addition(a, b)+", detail: "+a+"+"+b+"= "+calculatorService.addition(a, b);
	}

	@GetMapping("/subtraction")
	@ResponseBody
	public String subtract(@RequestParam int a, @RequestParam int b) {
		return "Result: "+ calculatorService.subtraction(a, b)+", detail: "+a+"-"+b+"= "+calculatorService.subtraction(a, b);
	}
	
	@GetMapping("/multiplication")
	@ResponseBody
	public String multiply(@RequestParam int a, @RequestParam int b) {
		return "Result: "+ calculatorService.multiplication(a, b)+", detail: "+a+"*"+b+"= "+calculatorService.multiplication(a, b);
	}
	
	@GetMapping("/division")
	@ResponseBody
	public String divide(@RequestParam int a, @RequestParam int b) {
		if(b==0) {
			return "Divide by zero, undefined!!";
		}
		else{
			return "Result: "+ calculatorService.division(a, b)+", detail: "+a+"/"+b+"= "+calculatorService.division(a, b);
		}
	}
	
	@GetMapping("/square")
	@ResponseBody
	public String square(@RequestParam int a) {
		return "Result: "+ calculatorService.square(a)+", detail: Square of "+a+"= "+calculatorService.square(a);
	}
	
	@GetMapping("/squareroot")
	@ResponseBody
	public String squareRoot(@RequestParam int a) {
		if(a<0){
			return "Can't find square root of negative value!";
		}
		else{
		return "Result: "+ calculatorService.squareRoot(a)+", detail: Squareroot of "+a+"= "+calculatorService.squareRoot(a);
		}
	}
	
	@GetMapping("/factorial")
	@ResponseBody
	public String factorial(@RequestParam int a) {
		return "Result: "+ calculatorService.factorial(a)+", detail: "+a+"!"+"= "+calculatorService.factorial(a);
	}
	
	@PostMapping("/min-max")
	@ResponseBody
	public String minMax(@RequestBody MinMaxList minMaxInput) {
			
			int min=0;
			int max=0;
			
			List<Integer> list=new ArrayList<>();
			for(Integer i: minMaxInput.getMinMaxInput()) {
				list.add(i);
			}
		String result=calculatorService.minMax(list, min, max);
		return result;
	}
}

