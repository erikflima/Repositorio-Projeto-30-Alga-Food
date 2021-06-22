package com.erik.projeto.di.notificacao;
import com.erik.projeto.di.modelo.Cliente;


public interface Notificador {

	void notificar( Cliente cliente, String mensagem );

}