package com.erik.projeto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.erik.projeto.di.notificacao.NotificadorEmail;
import com.erik.projeto.di.service.AtivacaoClienteService;



//@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
	
		return new AtivacaoClienteService(notificadorEmail());
	
	}
	
}