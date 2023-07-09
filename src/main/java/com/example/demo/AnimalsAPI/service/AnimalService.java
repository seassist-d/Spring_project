package com.example.demo.AnimalsAPI.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.Animal;
import com.example.demo.AnimalsAPI.repository.AnimalsAPIRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class AnimalService {

	private AnimalsAPIRepository animalsAPIRepository;

	public AnimalService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public List<Animal> getAnimals() throws JsonMappingException, JsonProcessingException {
		Animal[] animalsList = animalsAPIRepository.getAnimals();

		return Arrays.asList(animalsList);
	}

	public Animal[] getAnimalData(int id) throws JsonMappingException, JsonProcessingException {
		Animal[] animalData = animalsAPIRepository.getAnimalData(id);

		return animalData;
	}
}
