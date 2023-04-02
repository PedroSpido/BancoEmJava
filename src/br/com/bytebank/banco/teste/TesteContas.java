 package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(430, 200);
		
		cc.deposita(100);
			
		ContaPoupanca cp = new ContaPoupanca(400, 200);
		
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());

	}

}
