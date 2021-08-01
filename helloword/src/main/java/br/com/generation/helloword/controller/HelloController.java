package br.com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
                                         //Ctrl + Shift + o importa automaticamenta os comando com "@"

@RestController                          // essa "Class" é uma classe controladora
@RequestMapping("/hello")                // "@Resquestmapping" é o caminho que ela vai responder que no caso é o nosso "public String hello()" 
public class HelloController {
	
	@GetMapping                          // temos que responder a uma requisição do tipo "Get"
	public String hello() {              // a mensagem "hello" é uma mensagem ou seja temos que usar "String" e usar "()".
		 return "Hello Word! Bem vindo ao mundo Spring!! Boa Sorte Gabriel!";  
		                                 // o "return" retorna sua "String" com um texto de sua preferencia
		 
	}

}
