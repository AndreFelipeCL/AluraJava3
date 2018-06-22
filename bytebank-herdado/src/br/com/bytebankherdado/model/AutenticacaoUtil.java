package br.com.bytebankherdado.model;

public class AutenticacaoUtil {
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return senha == this.senha;
	}
}
