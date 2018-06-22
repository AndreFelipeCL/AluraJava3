package br.com.bytebankherdado.model;

import br.com.bytebankherdado.interfaces.Autenticavel;

public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
}
