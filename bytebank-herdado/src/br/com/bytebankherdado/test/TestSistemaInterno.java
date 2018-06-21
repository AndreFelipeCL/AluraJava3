package br.com.bytebankherdado.test;

import br.com.bytebankherdado.model.Gerente;
import br.com.bytebankherdado.model.SistemaInterno;

public class TestSistemaInterno {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(g);
	}
	
}
