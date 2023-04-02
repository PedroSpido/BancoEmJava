package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDePrimitivos {

public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		int teste = 10;
		idades[2] = teste;
		
		System.out.println(idades[2]);
		
		int idade = 20;
		
		double valor = (double)idade;//cast que acontece implitamente
		
		System.out.println(valor);
	}
}	

