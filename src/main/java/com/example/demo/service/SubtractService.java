package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractService {
	public int subtract(int numFirst, int numSeccond) {
		return numFirst - numSeccond;
	}
}
