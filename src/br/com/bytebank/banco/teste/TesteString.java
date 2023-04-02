package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Tributavel;

public class TesteString {

	public static void main(String[] args) {
		
//		String vazio = "     Pedro Alura";
//		String novoVazio = vazio.trim();
//		
//		System.out.println(novoVazio);
//		
//		String nome = "Pedro";
//		String nome2 = "Alura";
		
		//String nomeNome = new String("Pedro");
		
//		String novo = nome.replace("P", "p"); 
//		String novo2 = nome2.toLowerCase();
//		char c = nome.charAt(3);
//		int a = nome.indexOf('d');
		
//		System.out.println(a);
//		System.out.println(c);
//		System.out.println(nome);
//		System.out.println(novo);
//		System.out.println();
//		System.out.println(nome2);
//		System.out.println(novo2);
		 
	
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);
 
		System.out.println(nome);
	}

}
