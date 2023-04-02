package br.com.bytebank.banco.teste.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.NumeroDaContaComparator;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoClasseAnonima {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);   
		lista.add(cc4);
		
		//Pode fazer assim
		Comparator<Conta> comp = new Comparator<Conta>() { //Classe anonima
			
				@Override
				public int compare(Conta c1, Conta c2) { //Metodo que compara o numero das contas			
					return Integer.compare(c1.getNumero(), c2.getNumero());
				}  
			};
		
		lista.sort(comp);
		
		//OOOOU
		
		//Assim, diretamente no metodo:
		lista.sort(new Comparator<Conta>() { //Classe anonima			
				@Override
				public int compare(Conta c1, Conta c2) { //Metodo que compara o numero das contas			
					return Integer.compare(c1.getNumero(), c2.getNumero());
				}  
			}
		);
		
		//----------------------------------------------------------------------------------------//
		Comparator<Conta> comp3 = new Comparator<Conta>(){ //Outra Classe anonima
			@Override
			public int compare(Conta c1, Conta c2) {
				String nome1 = c1.getTitular().getNome();
				String nome2 = c2.getTitular().getNome();
				return nome1.compareTo(nome2); //Metodo que compara as Strings e ordena em ordem alfabetica
			}			
		};
		
		System.out.println("Lista com numeros em ordem crescente:");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
}







