package br.org.generation.helloworld.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/atividade2")
public class Atividade2 {
	
	@GetMapping
	public String atividade2() {
		return " Meus objetivos para essa semana é focar no processo de aprendizagem e em persistir no conteudo!";
		
	}

}
