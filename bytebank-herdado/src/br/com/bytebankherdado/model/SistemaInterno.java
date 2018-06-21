package br.com.bytebankherdado.model;

public class SistemaInterno {

	public int senha = 222;
	
	public void autentica(Gerente g) {
		if(g.autentica(this.senha)) {
			System.out.println("Pode entrar no sistema...");
		} else {
			System.out.println("Não pode entrar no sistema...");
		}
	}
}
