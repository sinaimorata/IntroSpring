package com.KeepCoding.intro.initializr.hello_spring_intializr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KeepCoding.intro.initializr.hello_spring_intializr.entity.Persona;
import com.KeepCoding.intro.initializr.hello_spring_intializr.service.PersonaService;
import com.KeepCoding.intro.initializr.hello_spring_intializr.serviceImpl.PersonaServiceImpl;

@RestController
public class PersonaController {

	@Autowired
	private PersonaServiceImpl personaService;
	
	
	@GetMapping("/personas")
	public List<Persona> listado(){
		
		
		return personaService.listaPersona();
	}
	
	@GetMapping("/newperson")
	public String insertarPersona(){
		
		personaService.insertaPersona();
		return "Todo ha ido bien";
	}
		
		
	
}
