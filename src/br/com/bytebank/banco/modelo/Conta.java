package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma Conta
 * @author Pedro Spido
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta>, Serializable { //A classe Conta se tornou "comparavel"
	private static final long serialVersionUID = 1L;
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor que inicializa o objeto a partir da agencia e numero
	 * @param numero
	 * @param agencia
	 */
	public Conta (int agencia, int numero) {
		Conta.total++;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Metodo que saca o valor se o valor for menor que o saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente: "+"Saldo: "+ this.saldo+", Valor a sacar: "+ valor);
		}else {
			this.saldo -= valor;
		}
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "numero: "+ this.numero + "/ agencia: "+this.agencia+ " Saldo: "+ this.saldo;
	}
	
	@Override
	public int compareTo(Conta outraconta) { //Define a ordem natural da Conta
		return Double.compare(this.saldo, outraconta.saldo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
}
