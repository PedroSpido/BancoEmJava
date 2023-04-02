package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; //importando todas (*) as classes da pasta/pacote "modelo"

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 321);

		cc.deposita(300);

		try {
			cc.saca(400);
		}catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Saldo Atual: "+cc.getSaldo());
	}			
}
