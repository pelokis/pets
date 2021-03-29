package com.local.ejemplo.webservice.pets.model;

public class Pet {
	private int id;
	private String name;
	private Animal animal;
	
	public Pet() {
		super();
	}

	public Pet(int id, String name, Animal animal) {
		super();
		this.id = id;
		this.name = name;
		this.animal = animal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
