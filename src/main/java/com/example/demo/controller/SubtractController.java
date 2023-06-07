package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.SubtractService;

@Controller
public class SubtractController {
	private final SubtractService subtractService;
	
	@Autowired
	public SubtractController(SubtractService subtractService) {
		this.subtractService = subtractService;
	}
	
	@GetMapping("subTract")
	public String doGet(Model model) {
		return "subTract.html";
	}
	
	@PostMapping("subTract")
	public String doPost(@RequestParam("numFirst") int numFirst, @RequestParam("numSeccond") int numSeccond, Model model) {
		int result = subtractService.subtract(numFirst, numSeccond);
		
		model.addAttribute("result", result);
		
		return "subTract.html";
	}
	
}
