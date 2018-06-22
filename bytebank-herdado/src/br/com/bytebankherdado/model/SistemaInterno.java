package br.com.bytebankherdado.model;

import br.com.bytebankherdado.interfaces.Autenticavel;

public class SistemaInterno {

	public int senha = 222;
	
	public void autentica(Autenticavel fa) {
		if(fa.autentica(this.senha)) {
			System.out.println("Pode entrar no sistema...");
		} else {
			System.out.println("Não pode entrar no sistema...");
		}
	}
}
