package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.PlusService;

@Controller
public class PlusController {
	private final PlusService plusService;
	
	@Autowired
	public PlusController(PlusService plusService) {
		this.plusService = plusService;
	}
	
	@GetMapping("plus")
	public String doGet(Model model) {
		String result = "";
		
		result = String.valueOf(plusService.plus(5, 6));
		
		model.addAttribute("result", result);
		
		return "plus.html";
	}
}
