package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; //importando todas as classes da pasta "modelo"

public class CriaConta {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente contaDoPedro = new ContaCorrente(1335, 2985);
		
		Cliente pedro = new Cliente();
		
		pedro.setNome("Pedro Spido"); 
		contaDoPedro.setTitular(pedro);
		
		contaDoPedro.deposita(5000);
		
		System.out.println(contaDoPedro.getTitular().getNome());
		System.out.println(contaDoPedro.getSaldo());
		
		
		ContaCorrente contaDoMatheus = new ContaCorrente(1336, 2985);
		
		Cliente matheus = new Cliente();
		
		contaDoMatheus.setTitular(matheus);

		contaDoMatheus.getTitular().setNome("Matheus Spido");
		
		contaDoMatheus.deposita(3000);
		contaDoMatheus.transfere(500, contaDoPedro);
		System.out.println("Saldo de Pedro "
				+ "depois da transferencia: "+ contaDoPedro.getSaldo());
		
		System.out.println();
		System.out.println(contaDoMatheus.getTitular().getNome());
		System.out.println(contaDoMatheus.getSaldo());
		
		//ou
		
		Cliente donoDaConta = contaDoMatheus.getTitular();
		
		donoDaConta.setCep("13050183");
		
		System.out.println(); 
		System.out.println("Total de contas: "+ Conta.getTotal());
		
	}
}
