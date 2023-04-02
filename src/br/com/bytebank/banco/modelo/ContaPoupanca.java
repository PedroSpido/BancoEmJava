package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	//chamando o costrutor especifico da classe mae
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta Poupanca = " + super.toString();
	}

}
