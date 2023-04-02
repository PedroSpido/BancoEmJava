 package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteAdaptaArrays {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		
		ContaPoupanca cp = new ContaPoupanca(1112, 1234);
		
		ContaCorrente cc2 = new ContaCorrente(111, 22253);
		
		Cliente cl = new Cliente();
		
		guardador.adiciona(cc);
			
		guardador.adiciona(cp);
		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		
		System.out.println("Quantidade de elementos: "+tamanho);  
		
		System.out.println();
		
		Conta referenciaCc = (ContaCorrente)guardador.getReferencia(2);
		
		System.out.println(referenciaCc);
		System.out.println(referenciaCc.getNumero());
		
		System.out.println();
		
		Conta referenciaCli = (Conta)guardador.getReferencia(1);
		
		Cliente cli = new Cliente();
		
		referenciaCli.setTitular(cli);
		
		referenciaCli.getTitular().setCpf("23341253567");;
		
		System.out.println(referenciaCli.getTitular().getCpf());		
		
	}
}
