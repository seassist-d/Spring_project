package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CalculatorService;

@Controller
public class CalculatorController {
	private final CalculatorService calculatorService;
	
	@Autowired
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService  = calculatorService;
	}
	
	@GetMapping("calculator")
	public String doGet() {
		return "calculator.html";
	}
	
	@PostMapping("calculator")
	public String doPost(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("calculation") String calculation, Model model) {
		int result = calculatorService.calculator(num1, num2, calculation);
		
		model.addAttribute("result", result);
		
		return "calculator.html";
	}
}
