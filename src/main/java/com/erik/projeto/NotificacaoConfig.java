package com.erik.projeto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.erik.projeto.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	//Definicao para o Spring de como gerar uma instancia da classe "NotificadorEmail" quando eu pedir para injetar um objeto desse tipo.
	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail( "smtp.algamail.com.br" );
		
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}