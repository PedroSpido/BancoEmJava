package br.com.bytebank.banco.teste.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.NumeroDaContaComparator;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoString {

	public static void main(String[] args) {

		 Conta cc1 = new ContaCorrente(22, 33);
         Cliente clienteCC1 = new Cliente();
         clienteCC1.setNome("Nico");
         cc1.setTitular(clienteCC1);
         cc1.deposita(333.0);

         Conta cc2 = new ContaPoupanca(22, 44);
         Cliente clienteCC2 = new Cliente();
         clienteCC2.setNome("Guilherme");
         cc2.setTitular(clienteCC2);
         cc2.deposita(444.0);

         Conta cc3 = new ContaCorrente(22, 11);
         Cliente clienteCC3 = new Cliente();
         clienteCC3.setNome("Paulo");
         cc3.setTitular(clienteCC3);
         cc3.deposita(111.0);

         Conta cc4 = new ContaPoupanca(22, 22);
         Cliente clienteCC4 = new Cliente();
         clienteCC4.setNome("Ana");
         cc4.setTitular(clienteCC4);
         cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);   
		lista.add(cc4);
		
		System.out.println("Antes do Sort:");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Function Object 
		NomeDaContaComparator comparador = new NomeDaContaComparator();
		
		lista.sort(comparador); //Metodo que ordena a lista de contas em ordem alfabetica
		
		System.out.println();
		System.out.println("Depois do Sort organizado em ordem alfabetica:");
		for (Conta conta : lista) {
			System.out.println(conta + ": "+ conta.getTitular().getNome());
		}
	} 
	
}

class NumeroDaContaComparator2 implements Comparator<Conta> { //compara a lista de contas (<contas>)

	@Override
	public int compare(Conta c1, Conta c2) { //Metodo que compara o numero das contas	
		return Integer.compare(c1.getNumero(), c2.getNumero());

	}  
}

class NomeDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		String nome1 = c1.getTitular().getNome();
		String nome2 = c2.getTitular().getNome();
		return nome1.compareTo(nome2); //Metodo que compara as Strings e ordena em ordem alfabetica
	}
	
}


