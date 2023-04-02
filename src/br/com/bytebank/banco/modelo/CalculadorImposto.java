package br.com.bytebank.banco.modelo;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void calculaImposto(Tributavel t) {
		double valorImposto = t.getValorImposto();	
		this.totalImposto += valorImposto;
	}
	
	public double getValorTotal() {
		return this.totalImposto;
	}
}
