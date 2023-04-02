package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		Conta[] referencias = new Conta[5];//Criando um array de 5 posições para referencias do tipo Object
		
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		
		referencias[0] = cc1; //fazendo uma copia da referencia cc1 e guardando na posicao 0 do array
		
		ContaCorrente contaref = (ContaCorrente)referencias[0];
		
		contaref.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca(134, 345);
		
		referencias[1] = cp; 
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; //TYPECAST OU CAST
		
		System.out.println(ref.getAgencia());
		
		System.out.println(cc1.getSaldo()); //provando que referencias[0] tem uma cópia da referência cc1
	}
}
