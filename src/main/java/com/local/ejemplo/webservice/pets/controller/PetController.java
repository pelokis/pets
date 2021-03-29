package com.local.ejemplo.webservice.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.local.ejemplo.webservice.pets.exception.PetServiceException;
import com.local.ejemplo.webservice.pets.model.Pet;
import com.local.ejemplo.webservice.pets.service.PetService;

@RestController
public class PetController {
	@Autowired
	PetService petService;
	
	@RequestMapping("/home")
	public String Hello() {
		return "Hello from PetController";
	}
	
	@RequestMapping(value = "/pets", method = RequestMethod.GET, produces = {})
	public List<Pet> findAll(){
		return petService.findAll();
	}
	
	@RequestMapping(value = "/pets/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pet findById(@PathVariable("id") int id) throws PetServiceException{
		return petService.findById(id);
	}
}
