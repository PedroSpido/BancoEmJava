package br.com.bytebank.banco.ContaEspecial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}	
}
