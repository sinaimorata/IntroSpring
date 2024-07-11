package com.KeepCoding.intro.initializr.hello_spring_intializr.helloword;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KeepCoding.intro.initializr.hello_spring_intializr.entity.Persona;


//TOMARLO COMO UN CONTROLADOR:EJECUTAR LAS RUTAS DEFINIDAS DENTRO
@RestController
public class Hellow {
	
	@Autowired
	Persona persona;
	
	
//	Persona objPersona;
//	Persona objPersona2;
//	Persona objPersona3;
	List<Persona> listaPersona = null;
	
	//RUTA DEFINIDA: SALUDAR
    @GetMapping("/saludar")
	//public Persona saludar () {
	public List<Persona> saludar(){
		//Persona objPersona = new Persona("Carlos","Perez","1625894a","cperez@gmail.com",915513245);
		//return objPersona;
//		objPersona = new Persona("Carlos", "Perez", "2053421a", "camino@com", 6451254);
//		objPersona2 = new Persona("Carlos", "Dominguez", "3253421a", "camino@com", 6451254);
//		objPersona3 = new Persona("Maria", "Perez", "2053421a", "ale@com", 6551254);
		listaPersona = new ArrayList<Persona>();
    	persona.setNombre("Carlos");
    	persona.setApellido("Sanchez");
    	persona.setDni("508597414A");
    	persona.setEmail("rsanchez@gmail.com)");
    	persona.setTelefono(5513248);
    	listaPersona.add(persona);
    			
//		listaPersona.add(objPersona);
//		listaPersona.add(objPersona2);
//		listaPersona.add(objPersona3);
		return listaPersona;
	}

}
