package br.com.bytebankherdado.test;

import br.com.bytebankherdado.model.Administrador;
import br.com.bytebankherdado.model.Gerente;
import br.com.bytebankherdado.model.SistemaInterno;

public class TestSistemaInterno {
	
	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();

		Gerente g = new Gerente();
		g.setSenha(222);
		
		si.autentica(g);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		si.autentica(g);
	}
	
}
