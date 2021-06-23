package com.erik.projeto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.erik.projeto.di.notificacao.Notificador;
import com.erik.projeto.di.service.AtivacaoClienteService;


@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService( Notificador notificador ) {
		
		return new AtivacaoClienteService( notificador );
	}
	
}