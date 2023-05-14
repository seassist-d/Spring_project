package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	private final FizzBuzzService fizzBuzzService;
	
	@Autowired
	public FizzBuzzController (FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	
	@GetMapping("fizzBuzz")
	public String fizzBuzz(Model model) {
		List<String> fizzBuzzList = fizzBuzzService.getFizzBuzz();
		
		model.addAttribute("fizzBuzzList", fizzBuzzList);
		
		return "fizzBuzz.html";
		
	}
}
