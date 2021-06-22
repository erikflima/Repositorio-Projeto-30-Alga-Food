package com.erik.projeto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {

	public MeuPrimeiroController() {
	}
	
	//-------------------------------------//
	
	@GetMapping("/hello")
	public String hello(){
		
		return "Hello Erik";
	}
	
}