package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/hello-world") 
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return " Hello World, buenas tardes ! ";
	}
	
		
	
	@GetMapping("/bsm")
	public String bsm() {
		return " BSM \n\nMentalidades: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência; \nHabilidades: Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação; ";
	}

	@RequestMapping ("/obj-semana") 
	@GetMapping("/obj-semana")
	public String ObjSemana() {
		return " Objetivo da Semana:\n  Praticar o Crud, criando um projeto pessoal.";
	}
	
}