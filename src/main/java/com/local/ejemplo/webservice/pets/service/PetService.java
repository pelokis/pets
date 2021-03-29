package com.local.ejemplo.webservice.pets.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.local.ejemplo.webservice.pets.exception.PetServiceException;
import com.local.ejemplo.webservice.pets.model.Animal;
import com.local.ejemplo.webservice.pets.model.Pet;

@Service
public class PetService {
	List<Pet> pets;
	
	public List<Pet> findAll() {
		if(pets == null) {
			pets = new ArrayList<Pet>();
			pets.add(new Pet(1, "Kira", new Animal("Perro")));
			pets.add(new Pet(2, "Ron", new Animal("Perro")));
			pets.add(new Pet(3, "Logan", new Animal("Gato")));
		}
		return pets;
	}
	
	public Pet findById(int id) throws PetServiceException {
		for(Pet pet: findAll()) {
			if(pet.getId() == id) {
				System.out.println("El id es: " + id);
				return pet;
			}
		}		
		throw new PetServiceException("Don´t exist the pet whith " + id + " key");
	}
}
