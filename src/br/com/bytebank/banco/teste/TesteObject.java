package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteObject {

public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(11, 22);
		
		System.out.println(cc);
		
		String s = "Pedro";
		
		String novoS = s.toUpperCase();
		
		System.out.println(novoS);
		
	}
}	

