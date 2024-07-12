package com.KeepCoding.intro.initializr.hello_spring_intializr.service;

import java.util.List;

import com.KeepCoding.intro.initializr.hello_spring_intializr.entity.Persona;

public interface PersonaService {
	//metodos abstractos
	//método que devuelve listado de objetos persona
	List<Persona> listaPersona ();
	
	//método que inserta
	void insertaPersona();
}
