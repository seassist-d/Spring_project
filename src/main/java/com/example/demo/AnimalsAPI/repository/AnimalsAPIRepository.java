package com.example.demo.AnimalsAPI.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.AnimalsAPI.data.Animal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalsAPIRepository {

	public Animal[] getAnimals() throws JsonMappingException, JsonProcessingException {
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi";

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> response = rest.getForEntity(url, String.class);

		String json = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animal[] animalsList = mapper.readValue(json, Animal[].class);

		return animalsList;
	}

	public Animal[] getAnimalData(int id) throws JsonMappingException, JsonProcessingException {
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi?id=" + id;

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> response = rest.getForEntity(url, String.class);

		String json = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animal[] animal = mapper.readValue(json, Animal[].class);

		return animal;
	}
}
