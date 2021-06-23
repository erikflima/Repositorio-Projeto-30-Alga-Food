package com.erik.projeto.di.service;
import com.erik.projeto.di.modelo.Cliente;
import com.erik.projeto.di.notificacao.Notificador;


public class AtivacaoClienteService {


	private Notificador notificador;
	
	
	//-------------------------------------------------------------//
	
	public AtivacaoClienteService(Notificador notificador) {
		
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	
	public void ativar(Cliente cliente) {
		
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}