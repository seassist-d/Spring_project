package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	public List<String> getFizzBuzz() {
		List<String> fizzBuzzList = new ArrayList<>();
		
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add("FizzBuzz");
			} else if (i % 3 == 0) {
				fizzBuzzList.add("Fizz");
			} else if (i % 5 == 0) {
				fizzBuzzList.add("Buzz");
			} else {
				fizzBuzzList.add(String.valueOf(i));
			}
		}
		
		return fizzBuzzList;
	}
}
