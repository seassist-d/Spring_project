package com.example.demo.AnimalsAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.Animal;
import com.example.demo.AnimalsAPI.service.AnimalService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class AnimalController {

	private final AnimalService animalService;

	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}

	@GetMapping("/animalSearch")
	public String searchPets(Model model) throws JsonMappingException, JsonProcessingException {
		List<Animal> animalsList = animalService.getAnimals();

		model.addAttribute("animalsList", animalsList);

		return "animalSearch.html";
	}
	
	@PostMapping("/animalDetail")
	public String getAnimalData(@RequestParam("animalId") int id, Model model) throws JsonMappingException, JsonProcessingException {
		Animal[] animalData = animalService.getAnimalData(id);
		
		model.addAttribute("animalData", animalData);
		
		return "animalDetail.html";
	}
}
