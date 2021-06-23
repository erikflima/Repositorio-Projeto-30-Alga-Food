package com.erik.projeto.di.service;
import org.springframework.stereotype.Component;
import com.erik.projeto.di.modelo.Cliente;
import com.erik.projeto.di.notificacao.Notificador;


@Component
public class AtivacaoClienteService {

	//@Autowired
	private Notificador notificador;
	

 	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	

 	//-----------------------------------------------//
 	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}


	
}
