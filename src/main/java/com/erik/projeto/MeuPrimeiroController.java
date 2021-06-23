package com.erik.projeto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erik.projeto.di.modelo.Cliente;
import com.erik.projeto.di.service.AtivacaoClienteService;

@RestController
public class MeuPrimeiroController {

	
	private AtivacaoClienteService ativacaoClienteService;
	
	
	public MeuPrimeiroController( AtivacaoClienteService ativacaoClienteService ){

		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}
	
	//-------------------------------------//

	@GetMapping("/hello")
	public String hello(){
		
	    Cliente joao = new Cliente( "João", "joao@xyz.com", "3499998888" );
	    
	    ativacaoClienteService.ativar( joao );		
		
		return "Hello Erik";
	}
	
}