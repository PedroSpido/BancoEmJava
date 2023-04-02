package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class testaGetESet {
	
	public static void main(String[] args) {
		
		ContaPoupanca conta = new ContaPoupanca(480, 2985);
		
		conta.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(123, 0432);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		System.out.println("Total de contas: "+cc.getTotal());
		System.out.println(conta.getSaldo());
	}

}
