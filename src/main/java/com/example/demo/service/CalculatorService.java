package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public int calculator(int num1, int num2, String calculation) {
		int result = 0;
		
		if ("+".equals(calculation)) {
			result = num1 + num2;
			
		} else if ("-".equals(calculation)) {
			result = num1 - num2;
			
		} else if ("×".equals(calculation)) {
			result = num1 * num2;
			
		} else if ("÷".equals(calculation)) {
			result = num1 / num2;	
		}
		
		return result;
	}
}
