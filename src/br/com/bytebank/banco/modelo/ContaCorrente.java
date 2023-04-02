package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.ContaCorrente => FQN 
public class ContaCorrente extends Conta implements Tributavel {

	//chamando um construtor especifico da classe mae
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); 
	}
	
	//adicionando uma taxa de dois centavos para o saque de dinheiro da Conta Corrente
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorComTaxa = valor + 0.2;
		super.saca(valorComTaxa);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public double getValorImposto() {
		double valor = (super.saldo * 1)/100;
		return valor;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente = " + super.toString();
	}
}
