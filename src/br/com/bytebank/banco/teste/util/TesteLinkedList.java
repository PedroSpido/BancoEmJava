package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		//Generics
		List<Conta> lista = new LinkedList<Conta>(); //Especificando que esse ArrayList só recebe referencias do tipo Conta
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		
		ContaPoupanca cp1 = new ContaPoupanca(111, 1234);
		
		ContaPoupanca cp2 = new ContaPoupanca(111, 1234);
		
		lista.add(cc);
		lista.add(cp1); 
		
		lista.remove(0); //remove a referencia que esta na posição 0 do LinkedList de referencias de contas
		boolean contem = lista.contains(cp2);
		
		System.out.println("Existe? "+ contem);
		
		Conta referencia = lista.get(0);
		System.out.println(referencia.getNumero());
		
//		for(int i=0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}

	}

}
