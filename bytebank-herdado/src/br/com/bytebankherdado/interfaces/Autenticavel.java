package br.com.bytebankherdado.interfaces;

public abstract interface Autenticavel {
	
	public boolean autentica(int senha);

	public void setSenha(int senha);
	
}
