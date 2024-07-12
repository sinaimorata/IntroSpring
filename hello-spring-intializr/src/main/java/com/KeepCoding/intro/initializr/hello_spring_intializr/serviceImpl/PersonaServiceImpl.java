package com.KeepCoding.intro.initializr.hello_spring_intializr.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KeepCoding.intro.initializr.hello_spring_intializr.entity.Persona;
import com.KeepCoding.intro.initializr.hello_spring_intializr.service.PersonaService;




@Service
public class PersonaServiceImpl implements PersonaService {
	//inyectando el objeto persona
	@Autowired
	Persona persona;
	//declaro una lista de persona
	List<Persona> lista = new ArrayList<>();

	Persona objPersona;
	Persona objPersona2;
	Persona objPersona3;

	@Override
	public List<Persona> listaPersona() {
		if (lista.size() < 3){
			objPersona = new Persona ("Carlos","Perez", "50125874", "cperez@gmail.com",645332215);
			objPersona2 = new Persona ("Eufrasio","Perez", "54125874", "lazoazuz@gmail.com",645412215);
			objPersona3 = new Persona ("Maria","Perez", "52125874", "mperez@gmail.com",655332215);
			lista.add(objPersona);
			lista.add(objPersona2);
			lista.add(objPersona3);
			
		}
		
		return lista;


	}


	@Override
	public void insertaPersona() {
		persona.setNombre("Javier");
		persona.setApellido("Moreno");
		persona.setDni("57528425a");
		persona.setEmail("javi@gmail.com");
		persona.setTelefono(55132248);
		lista.add(persona);

	}

}


