package br.com.bytebankherdado.test;

import br.com.bytebankherdado.model.ContaCorrente;
import br.com.bytebankherdado.model.ContaPoupanca;

public class TestConta {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(001, 1);
		cc1.deposita(100.0);
		
		ContaPoupanca cp1 = new ContaPoupanca(001, 2);
		cp1.deposita(200.0);
		
		System.out.println(cc1);
		System.out.println(cp1);

		cc1.transfere(10.0, cp1);
		
		System.out.println(cc1);
		System.out.println(cp1);
		
		cc1.saca(9.0);
		System.out.println(cc1);
	}
}
