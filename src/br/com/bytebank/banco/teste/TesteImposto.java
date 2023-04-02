package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteImposto {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 123);
		
		cc.deposita(3000);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.calculaImposto(cc);
		ci.calculaImposto(sv);
		
		System.out.println("Valor total de impostos: "+ci.getValorTotal());
		
	}
}
