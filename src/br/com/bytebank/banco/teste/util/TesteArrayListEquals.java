package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>(); //Especificando que esse ArrayList só recebe referencias do tipo Conta
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		
		ContaPoupanca cp1 = new ContaPoupanca(111, 1234);
		 
		ContaPoupanca cp2 = new ContaPoupanca(111, 1234);
		
		lista.add(cc);
		lista.add(cp1);
		
		lista.remove(0);
		
		boolean contem = lista.contains(cp2);
		
		boolean igual = cp2.equals(cp1);
		System.out.println("e igual: "+ igual);
		
		System.out.println(cp2.hashCode() == cp1.hashCode());
		
		Conta referencia = lista.get(0);
		
		System.out.println("Existe? "+ contem);
		
		System.out.println(referencia.getNumero());
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		} 

	}

}


