package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

	public double getValorImposto() {
		double valor = (3000 * 10)/100;
		return valor;
	}
}
