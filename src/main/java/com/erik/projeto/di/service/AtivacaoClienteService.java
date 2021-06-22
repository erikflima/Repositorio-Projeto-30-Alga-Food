package com.erik.projeto.di.service;
import org.springframework.stereotype.Component;
import com.erik.projeto.di.modelo.Cliente;
import com.erik.projeto.di.notificacao.NotificadorEmail;


@Component
public class AtivacaoClienteService {

	
	private NotificadorEmail notificador;
	
	
	public void ativar( Cliente cliente ){
		
		cliente.ativar();

		notificador.notificar( cliente, "Seu cadastro no sistema está ativo!" );
	}
	
}