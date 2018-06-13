package br.com.bytebankherdado.model;

public class ContaCorrente extends Conta {

	private static final double TAXA_SAQUE = 0.2;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorTaxado = valor + TAXA_SAQUE;
		return super.saca(valorTaxado);
	}
	
}
