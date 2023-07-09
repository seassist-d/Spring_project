package com.example.demo.AnimalsAPI.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Animal {

	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("japanese_name")
	private String japaneseName;

	@JsonProperty("cry")
	private String cry;

}